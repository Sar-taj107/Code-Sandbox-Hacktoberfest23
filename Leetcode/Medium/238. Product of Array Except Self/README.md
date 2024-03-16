## 238. Product of Array Except Self

Given an integer array nums, *return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i]*.

The product of any prefix or suffix of ``nums`` is __guaranteed__ to fit in a 32-bit integer.

You must write an algorithm that runs in ``O(n)`` time and without using the division operation.

 

**Example 1:**

**Input:** nums = [1,2,3,4] <br>
**Output:** [24,12,8,6] <br>

**Example 2:**

**Input:** nums = [-1,1,0,-3,3]<br>
**Output:** [0,0,9,0,0]


**Constraints:**

- ``2 <= nums.length <= 10^5``

- ``-30 <= nums[i] <= 30``

- The product of any prefix or suffix of ``nums`` is __guaranteed__ to fit in a ``32-bit`` integer.
 

__Follow up:__ Can you solve the problem in O(1) extra space complexity? (The output array __does not__ count as extra space for space complexity analysis.)
