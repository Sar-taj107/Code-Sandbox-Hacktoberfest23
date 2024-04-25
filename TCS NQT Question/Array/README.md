## Find the samllest Element in array

Find the smallest element in an array

Problem Statement: Given an array, we have to find the smallest element in the array.

Examples:

**Example 1:**

**Input:** arr[] = {2,5,1,3,0}; <br>
**Output:** 0

**Explanation:** 0 is the smallest element in the array. 

**Example2:**

**Input:** arr[] = {8,10,5,7,9}; <br>
**Output:** 5

**Explanation:** 5 is the smallest element in the array.
Solution
Disclaimer: Don’t jump directly to the solution, try it out yourself first.

Solution1: Sorting

Intuition: We can sort the array in ascending order, hence the smallest element will be at the 0th index. 

Approach: 

Sort the array in ascending order.
Print the 0th index.
DryRun: 

Before sorting: arr[] = {2,5,1,3,0};

After sorting: arr[] = {0,1,2,3,5};

Hence answer : arr[0] = 0