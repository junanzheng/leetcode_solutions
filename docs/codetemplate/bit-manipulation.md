# 0x01 位运算

## 移位运算

* 算数左移：`1 << n ` =  $2 ^ n$, `n << 1 = 2n`
* 算数右移：`n >> 1` = $\lfloor\frac{n}{2.0}\rfloor$，相当于除2向下取整

## 二进制状态压缩

* 将一个长度为m 的bool数组用一个m位二进制整数表示并存储

| 操作                                               | 运算                 |
| -------------------------------------------------- | -------------------- |
| 取出整数 n 在二进制表示下的第 k 位                 | `(n >> k) & 1`       |
| 取出整数 n 在二进制表示下的第 0 ~ k - 1位（后k位） | `n & ((1 << k) - 1)` |
| 把整数 n 在二进制表示下的第 k 位取反               | `n xor (1 << k)`     |
| 对整数 n 在二进制表示下的第 k 位赋值 1             | `n 位或 (1 << k)`    |
| 对整数 n 在二进制表示下的第 k 位赋值 0             | `n & (~(1 << k))`    |

* 有符号右移运算符： `>>`
  * 若值为正：高位插0，
  * 若值为负：高位插1
* 无符号右移运算符： `>>>`
  * 无论正负： 高位插0
* `Integer.toBinaryString(int paramter)`转二进制数