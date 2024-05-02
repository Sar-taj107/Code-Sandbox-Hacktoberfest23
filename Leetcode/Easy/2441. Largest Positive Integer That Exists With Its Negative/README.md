## 2441. Largest Positive Integer That Exists With Its Negative

### Click the link below for complete Explanation 👇✅

[Leetcode Solution](https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative/solutions/5100951/simple-solution-2-approaches-hashset-two-pointer-easy-java-explanation/)

Given an integer array ``nums`` that __does not contain__ any zeros, find __the largest positive__ integer k such that ``-k`` also exists in the array.

Return *the positive integer k. If there is no such integer, return -1*.

 

**Example 1:**

**Input:** nums = [-1,2,-3,3] <br>
**Output:** 3  <br>
**Explanation:** 3 is the only valid k we can find in the array.

**Example 2:**

**Input:** nums = [-1,10,6,7,-7,1] <br>
**Output:** 7  <br>
**Explanation:** Both 1 and 7 have their corresponding negative values in the array. 7 has a larger value.

**Example 3:**

**Input:** nums = [-10,8,6,7,-2,-3]
**Output:** -1
**Explanation:** There is no a single valid k, we return -1.
 

**Constraints:**

- ``1 <= nums.length <= 1000``

- ``-1000 <= nums[i] <= 1000``

- ``nums[i] != 0``