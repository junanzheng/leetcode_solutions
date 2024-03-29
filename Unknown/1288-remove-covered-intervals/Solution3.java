/*
 * @lc app=leetcode id=1288 lang=java
 *
 * [1288] Remove Covered Intervals
 * 解题思路：greedy
 * 
 */

// @lc code=start
class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (i, j) -> (i[0] == j[0] ? j[1] - i[1] : i[0] - j[0]));
        int count = 0, cur = 0;
        for (int[] a : intervals) {
            if (cur < a[1]) {
                cur = a[1];
                ++count;
            }
        }
        return count;        
    }
}
// @lc code=end
