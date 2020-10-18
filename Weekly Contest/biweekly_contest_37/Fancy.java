/**
 * [5530. 奇妙序列]
 * 
 */

class Fancy {
    static final int MOD = 1_000_000_007;
    static final int CAP = 100_000;

    static class SegTree {
        int[] mContent;
        int n;
        int size = 0;

        int[] addUpdate;
        int[] mulUpdate;

        SegTree() {
            n = 1;
            while (n < CAP) {
                n <<= 1;
            }
            mContent = new int[n << 1];
            addUpdate = new int[n << 1];
            mulUpdate = new int[n << 1];
            Arrays.fill(mulUpdate, 1);
        }

        void append(int val) {
            mContent[n + size++] = val;
        }

        void addAll(int inc) {
            if (size == 0) {
                return;
            }
            int l = 0;
            int r = n - 1;
            int index = 1;
            innerAddAll(inc, l, r, index);

        }

        private void innerAddAll(int inc, int l, int r, int index) {
            if (r < size) {
                addUpdate[index] += inc;
                addUpdate[index] %= MOD;
                return;
            }

            int mid = l + (r - l >> 1);
            innerAddAll(inc, l, mid, index << 1);
            if (mid + 1 < size) {
                innerAddAll(inc, mid + 1, r, (index << 1) + 1);
            }
        }

        void mulAll(int m) {
            if (size == 0) {
                return;
            }
            int l = 0;
            int r = n - 1;
            int index = 1;
            innerMulAll(m, l, r, index);
        }

        private void innerMulAll(int m, int l, int r, int index) {
            if (r < size) {
                long tmp = addUpdate[index];
                tmp *= m;
                addUpdate[index] = (int) (tmp % MOD);

                tmp = mulUpdate[index];
                tmp *= m;
                mulUpdate[index] = (int) (tmp % MOD);
                return;
            }

            int mid = l + (r - l >> 1);
            innerMulAll(m, l, mid, index << 1);
            if (mid + 1 < size) {
                innerMulAll(m, mid + 1, r, (index << 1) + 1);
            }
        }

        int getIndex(int idx) {
            if (idx < 0 || idx >= size) {
                return -1;
            }

            int index = n + idx;
            long val = mContent[index];
            while (index >= 1) {
                if (mulUpdate[index] != 1) {
                    val *= mulUpdate[index];
                    val %= MOD;
                }

                if (addUpdate[index] != 0) {
                    val += addUpdate[index];
                    val %= MOD;
                }
                index >>= 1;
            }
            return (int) val;
        }

    }

    SegTree tree = new SegTree();

    public Fancy() {

    }

    public void append(int val) {
        tree.append(val);
    }

    public void addAll(int inc) {
        tree.addAll(inc);
    }

    public void multAll(int m) {
        tree.mulAll(m);
    }

    public int getIndex(int idx) {
        return tree.getIndex(idx);
    }
}
/**
 * Your Fancy object will be instantiated and called as such:
 * Fancy obj = new Fancy();
 * obj.append(val);
 * obj.addAll(inc);
 * obj.multAll(m);
 * int param_4 = obj.getIndex(idx);
 */
