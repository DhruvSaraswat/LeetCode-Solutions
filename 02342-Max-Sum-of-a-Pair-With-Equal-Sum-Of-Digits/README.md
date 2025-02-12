# [2342. Max Sum of a Pair With Equal Sum of Digits](https://leetcode.com/problems/max-sum-of-a-pair-with-equal-sum-of-digits/description/) [Medium]

---
You are given a <b>0-indexed</b> array `nums` consisting of positive integers. You can choose two indices `i` and `j`, such that `i != j`, and the sum of digits of the number `nums[i]` is equal to that of `nums[j]`.

<br>

Return the maximum value of `nums[i] + nums[j]` that you can obtain over all possible indices `i` and `j` that satisfy the conditions.

<p>&nbsp;</p>
<b>Example 1:</b>

<pre>
<b>Input:</b> nums = [18,43,36,13,7]

<b>Output:</b> 54

<b>Explanation:</b> The pairs (i, j) that satisfy the conditions are:
<ul><li>(0, 2), both numbers have a sum of digits equal to 9, and their sum is 18 + 36 = 54.</li>
<li>(1, 4), both numbers have a sum of digits equal to 7, and their sum is 43 + 7 = 50.</li></ul>
So the maximum sum that we can obtain is 54.
</pre>

<br>
<b>Example 2:</b>

<pre>
<b>Input:</b> nums = [10,12,19,14]

<b>Output:</b> -1

<b>Explanation:</b> There are no two numbers that satisfy the conditions, so we return -1.
</pre>

<p>&nbsp;</p>
<b>Constraints:</b>
<ul>
<li><code>1 <= nums.length <= 10<sup>5</sup></code></li>
<br>
<li><code>1 <= nums[i] <= 10<sup>9</sup></code></li>
</ul>
