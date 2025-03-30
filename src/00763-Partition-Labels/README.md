# [763. Partition Labels](https://leetcode.com/problems/partition-labels/description/) [Medium]

You are given a string `s`. We want to partition the string into as many parts as possible so that each letter appears in at most one part. For example, the string `"ababcc"` can be partitioned into `["abab", "cc"]`, but partitions such as `["aba", "bcc"]` or `["ab", "ab", "cc"]` are invalid.

<br>

Note that the partition is done so that after concatenating all the parts in order, the resultant string should be `s`.

<br>

Return <i>a list of integers representing the size of these parts</i>.

<p>&nbsp;</p>
<p><b>Example 1:</b></p>

<pre>
<b>Input:</b> s = "ababcbacadefegdehijhklij"

<b>Output:</b> [9,7,8]

<b>Explanation:</b>
The partition is "ababcbaca", "defegde", "hijhklij".
This is a partition so that each letter appears in at most one part.
A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits s into less parts.
</pre>

<br>
<p><b>Example 2:</b></p>

<pre>
<b>Input:</b> s = "eccbbbbdec"

<b>Output:</b> [10]
</pre>

<p>&nbsp;</p>
<p><b>Constraints:</b></p>
<ul>
<li><code>1 <= s.length <= 500</code></li>
<br>
<li><code>s</code> consists of lowercase English letters.</li>
</ul>
