/*
 * @lc app=leetcode id=6 lang=java
 *
 * [6] ZigZag Conversion
 */

// @lc code=start
class Solution {
    public String convert(String s, int numRows) {
        if (numRows < 2) {
            return s;
        }
        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            rows.add(new StringBuilder());
        }
        int index = 0, flag = -1;
        for (char c : s.toCharArray()) {
            rows.get(index).append(c);
            if (index == 0 || index == numRows - 1) flag = -flag;
            index += flag;
        }

        StringBuilder res = new StringBuilder();
        for (StringBuilder row : rows) res.append(row);
        return res.toString();
    }
}
// @lc code=end

