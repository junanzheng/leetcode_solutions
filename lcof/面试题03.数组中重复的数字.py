""" 
找出数组中重复的数字。
在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次
请找出数组中任意一个重复的数字。
 """
 #使用hash表
class Solution:
    def findRepeatNumber(self, nums: List[int]) -> int:
        table=set()
        for i in range(len(nums)):
            if nums[i] in table :
                return nums[i]
            else:
                table.add(nums[i])
#使用list
class Solution_2:
    def findRepeatNumber(self,nums: List[int])->int:
        array=[0]*len(nums)
        for n in nums:
            if array[n]>0:
                return n
            else:
                array[n]+=1
