/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums) {
            if (i < 1 || n > nums[i - 1]) {
                nums[i++] = n;
            }
        }
        return i;
    }
}
// @lc code=end

