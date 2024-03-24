## 287. Find the Duplicate Number

### Click the link below for complete Explanation👇

[Leetcode Solution](https://leetcode.com/problems/find-the-duplicate-number/solutions/4918620/simple-java-solution-2-approaches-floyd-s-tortoise-and-hare-algorithm-hashmap/)

Given an array of integers ``nums`` containing ``n + 1`` integers where each integer is in the range ``[1, n]`` inclusive.

There is only one repeated number in ``nums``, return *this repeated number.*

You must solve the problem __without__ modifying the array ``nums`` and uses only constant extra space.

 

**Example 1:**

**Input:** nums = [1,3,4,2,2] <br>
**Output:** 2

**Example 2:**

**Input:** nums = [3,1,3,4,2]<br>
**Output:** 3

**Example 3:**

**Input:** nums = [3,3,3,3,3] <br>
**Output:** 3

**Constraints:**

- ``1 <= n <= 10^5``

- ``nums.length == n + 1``

- ``1 <= nums[i] <= n``

- ``All the integers in nums appear only once except for precisely one integer which appears two or more times.``
 

__Follow up: 💡__

- How can we prove that at least one duplicate number must exist in nums?

- Can you solve the problem in linear runtime complexity?