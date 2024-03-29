/*
 * @lc app=leetcode.cn id=1071 lang=java
 * 对于字符串 S 和 T，只有在 S = T + ... + T（T 与自身连接 1 次或多次）时，我们才认定 “T 能除尽 S”。
 * 返回最长字符串 X，要求满足 X 能除尽 str1 且 X 能除尽 str2。
 * [1071] 字符串的最大公因子
 */

// @lc code=start
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // 假设str1是N个x，str2是M个x，那么str1+str2肯定是等于str2+str1的。
        if(!(str1+str2).equals(str2+str1)){return "";}
        //辗转相除求gcb
        return str1.substring(0, gcb(str1.length(), str2.length()));

    }
    
    private int gcb(int a, int b){
        return b == 0? a: gcb(b,a%b);
    }
}
// @lc code=end

