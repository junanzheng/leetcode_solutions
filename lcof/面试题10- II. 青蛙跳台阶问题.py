""" 青蛙选择的方法有dp[i]=dp[i-1]+dp[i-2]其中
第i-1阶后向上爬一级台阶。
在第i-2阶后向上爬二级台阶。
所以到达第i 阶的方法总数就是到第 i-1 级台阶和第 i-2 级台阶的方法数之和
 """



class Solution:
    def numWays(self, n: int) -> int:
        dp = {}
        dp[0] = 1
        dp[1] = 1
        if n > 1:
            for i in range(2,n+1):
                dp[i] = dp[i-1] + dp[i-2]
                
        return dp[n]%1000000007