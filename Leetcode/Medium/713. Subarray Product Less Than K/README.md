## 713. Subarray Product Less Than K

### Click the link below for complete Explanation 👇

[Leetcode Solution](https://leetcode.com/problems/subarray-product-less-than-k/solutions/4932547/easy-to-understand-2-approaches-sliding-window-brute-force/)

Given an array of integers ``nums`` and an integer ``k``, return the number of contiguous subarrays where the product of all the elements in the subarray is strictly less than ``k``.

 
**Example 1:**

**Input:** nums = [10,5,2,6], k = 100 <br>
**Output:** 8 <br>
**Explanation:** The 8 subarrays that have product less than 100 are:
[10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6]
Note that [10, 5, 2] is not included as the product of 100 is not strictly less than k.

**Example 2:**

**Input:** nums = [1,2,3], k = 0 <br>
**Output:** 0

**Constraints:**

- ``1 <= nums.length <= 3 * 10^4``

- ``1 <= nums[i] <= 1000``

- ``0 <= k <= 10^6``