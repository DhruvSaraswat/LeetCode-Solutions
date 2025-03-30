# [56. Merge Intervals](https://leetcode.com/problems/merge-intervals/description/) [Medium]

Given an array of intervals where <code>intervals[i] = [start<sub>i</sub>, end<sub>i</sub>]</code>, merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

<p>&nbsp;</p>
<p><b>Example 1:</b></p>

<pre>
<b>Input:</b> intervals = [[1,3],[2,6],[8,10],[15,18]]

<b>Output:</b> [[1,6],[8,10],[15,18]]

<b>Explanation:</b> Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
</pre>

<br>
<p><b>Example 2:</b></p>

<pre>
<b>Input:</b> intervals = [[1,4],[4,5]]

<b>Output:</b> [[1,5]]

<b>Explanation:</b> Intervals [1,4] and [4,5] are considered overlapping.
</pre>

<p>&nbsp;</p>
<p><b>Constraints:</b></p>
<ul>
<li><code>1 <= intervals.length <= 10<sup>4</sup></code></li>
<br>
<li><code>intervals[i].length == 2</code></li>
<br>
<li><code>0 <= start<sub>i</sub> <= end<sub>i</sub> <= 10<sup>4</sup></code></li>
</ul>
