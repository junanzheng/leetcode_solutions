/*
 * @lc app=leetcode id=62 lang=java
 *
 * [62] Unique Paths
 * 解题思路：
 * 状态转移方程：dp[i][j] = dp[i - 1][j] + dp[i][j - 1]
 * 自底向上, 存整个二维数组
 */

// @lc code=start
class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < n; i++) dp[0][i] = 1;
        for (int i = 0; i < m; i++) dp[i][0] = 1;
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }
}
// @lc code=end
