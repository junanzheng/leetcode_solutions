import java.util.ArrayList;
import java.util.Collections;

/*
 * @lc app=leetcode.cn id=46 lang=java
 *
 * [46] 全排列：给定一个没有重复 数字的序列，返回其所有可能的全排列
 * 
 */

// @lc code=start
class Solution {
    public void backtrack(int n, ArrayList<Integer> output, List<List<Integer>> res, int first) {
        // 所有数填完了
        if (first == n) {
            res.add(new ArrayList<Integer>(output));
        }
        //
        for (int i = first; i < n; i++) {
            // 动态维护数组
            Collections.swap(output, first, i);
            // 继续递归填下一个数
            backtrack(n, output, res, first + 1);
            // 撤销操作
            Collections.swap(output, first, i);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        ArrayList<Integer> output = new ArrayList<>();
        for (int num : nums) {
            output.add(num);
        }
        int n = nums.length;
        backtrack(n, output, res, 0);
        return res;
    }
}
// @lc code=end
