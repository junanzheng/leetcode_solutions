#
# @lc app=leetcode.cn id=113 lang=python3
#
# [113] 路径总和 II
#

# @lc code=start
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def pathSum(self, root: TreeNode, sum: int) -> List[List[int]]:
        ret = list()
        path = list()

        def dfs(root: TreeNode, total: int):
            if not root:
                return
            path.append(root.val)
            total -= root.val
            if not root.left and not root.right and total == 0:
                ret.append(path[:])
            dfs(root.left, total)
            dfs(root.right, total)
            path.pop()

        dfs(root, sum)
        return ret
# @lc code=end

