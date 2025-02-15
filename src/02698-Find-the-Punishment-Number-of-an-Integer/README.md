# [2698. Find the Punishment Number of an Integer](https://leetcode.com/problems/find-the-punishment-number-of-an-integer/description/) [Medium]

Given a positive integer `n`, return the _**punishment number of**_ `n`.

The **punishment number** of `n` is defined as the sum of the squares of all integers `i` such that:

<ul>
<li><code>1 <= i <= n</code></li><br>
<li>The decimal representation of <code>i * i</code> can be partitioned into contiguous substrings such that the sum of the integer values of these substrings equals <code>i</code>.</li>
</ul>
<br>


<p>&nbsp;</p>
<p><b>Example 1:</b></p>

<pre>
<b>Input:</b> n = 10

<b>Output:</b> 182

<b>Explanation:</b> There are exactly 3 integers i in the range [1, 10] that satisfy the conditions in the statement:
- 1 since 1 * 1 = 1
- 9 since 9 * 9 = 81 and 81 can be partitioned into 8 and 1 with a sum equal to 8 + 1 == 9.
- 10 since 10 * 10 = 100 and 100 can be partitioned into 10 and 0 with a sum equal to 10 + 0 == 10.
Hence, the punishment number of 10 is 1 + 81 + 100 = 182
</pre>

<br>
<p><b>Example 2:</b></p>

<pre>
<b>Input:</b> n = 37

<b>Output:</b> 1478

<b>Explanation:</b> There are exactly 4 integers i in the range [1, 37] that satisfy the conditions in the statement:
- 1 since 1 * 1 = 1. 
- 9 since 9 * 9 = 81 and 81 can be partitioned into 8 + 1. 
- 10 since 10 * 10 = 100 and 100 can be partitioned into 10 + 0. 
- 36 since 36 * 36 = 1296 and 1296 can be partitioned into 1 + 29 + 6.
Hence, the punishment number of 37 is 1 + 81 + 100 + 1296 = 1478
</pre>

<p>&nbsp;</p>
<p><b>Constraints:</b></p>
<ul>
<li><code>1 <= n <= 1000</code></li>
</ul>
