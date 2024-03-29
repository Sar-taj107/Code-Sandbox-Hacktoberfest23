## 2485. Find the Pivot Integer

### Click the link below for complete Explanation 👇

[Leetcode Solution](https://leetcode.com/problems/find-the-pivot-integer/solutions/4870283/easy-to-understand-2-approaches-basic-math-prefixsum/)

Given a positive integer __n__, find the pivot integer __x__ such that:

The sum of all elements between 1 and x inclusively equals the sum of all elements between x and n inclusively.

*Return the __pivot integer x__. If no such integer exists, return -1. It is guaranteed that there will be at most one pivot index for the given input.*

 

**Example 1:**

**Input:** n = 8 <br>
**Output:** 6  <br>
**Explanation:** 6 is the pivot integer since: 1 + 2 + 3 + 4 + 5 + 6 = 6 + 7 + 8 = 21.

**Example 2:**

**Input:** n = 1  <br>
**Output:** 1 <br>
**Explanation:** 1 is the pivot integer since: 1 = 1.


**Example 3:**

**Input:** n = 4 <br>
**Output:** -1  <br>
**Explanation:** It can be proved that no such integer exist.


**Constraints:**

``1 <= n <= 1000``
