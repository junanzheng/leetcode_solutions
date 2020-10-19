#
# @lc app=leetcode.cn id=21 lang=python3
#
# [21] 合并两个有序链表
#

# @lc code=start
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def mergeTwoLists(self, l1: ListNode, l2: ListNode) -> ListNode:
        res=ListNode(None)
        node=res
        while l1 and l2:
            if l1.val<l2.val:
                node.next,l1=l1,l1.next
            else:
                node.next,l2=l2,l2.next
            node=node.next
        if l1:
            node.next=l1
        else:
            node.next=l2
        return res.next
# @lc code=end

