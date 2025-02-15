# [3066. Minimum Operations to Exceed Threshold Value II](https://leetcode.com/problems/minimum-operations-to-exceed-threshold-value-ii/description/) [Medium]

You are given a <b>0-indexed</b> integer array `nums`, and an integer `k`.

<br>

In one operation, you will:
<ul>
<li>Take the two smallest integers <code>x</code> and <code>y</code> in <code>nums</code>.</li>
<br>
<li>Remove <code>x</code> and <code>y</code> from <code>nums</code>.</li>
<br>
<li>Add <code>min(x, y) * 2 + max(x, y)</code> anywhere in the array.</li>
</ul>

<br>

<b>Note</b> that you can only apply the described operation if `nums` contains at least two elements.

<br>
Return the minimum number of operations needed so that all elements of the array are greater than or equal to `k`.

<p>&nbsp;</p>
<p><b>Example 1:</b></p>

<pre>
<b>Input:</b> nums = [2,11,10,1,3], k = 10

<b>Output:</b> 2

<b>Explanation:</b> In the first operation, we remove elements 1 and 2, then add 1 * 2 + 2 to nums. nums becomes equal to [4, 11, 10, 3].
In the second operation, we remove elements 3 and 4, then add 3 * 2 + 4 to nums. nums becomes equal to [10, 11, 10].
At this stage, all the elements of nums are greater than or equal to 10 so we can stop.
It can be shown that 2 is the minimum number of operations needed so that all elements of the array are greater than or equal to 10.
</pre>

<br>
<p><b>Example 2:</b></p>

<pre>
<b>Input:</b> nums = [1,1,2,4,9], k = 20

<b>Output:</b> 4

<b>Explanation:</b> After one operation, nums becomes equal to [2, 4, 9, 3].
After two operations, nums becomes equal to [7, 4, 9].
After three operations, nums becomes equal to [15, 9].
After four operations, nums becomes equal to [33].
At this stage, all the elements of nums are greater than 20 so we can stop.
It can be shown that 4 is the minimum number of operations needed so that all elements of the array are greater than or equal to 20.
</pre>

<p>&nbsp;</p>
<p><b>Constraints:</b></p>
<ul>
<li><code>2 <= nums.length <= 2 * 10<sup>5</sup></code></li>
<br>
<li><code>1 <= nums[i] <= 10<sup>9</sup></code></li>
<br>
<li><code>1 <= k <= 10<sup>9</sup></code></li>
<br>
<li>The input is generated such that an answer always exists. That is, there exists some sequence of operations after which all elements of the array are greater than or equal to <code>k</code>.</li>
</ul>
