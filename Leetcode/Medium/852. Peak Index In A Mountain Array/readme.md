# Peak Index in a Mountain Array

## Problem Description

An array `arr` is considered a mountain if it satisfies the following properties:
- The length of the array `arr` is at least 3.
- There exists an index `i` (0 < `i` < `arr.length - 1`) such that:
  - `arr[0] < arr[1] < ... < arr[i - 1] < arr[i]`
  - `arr[i] > arr[i + 1] > ... > arr[arr.length - 1]`

Given a mountain array `arr`, you need to find and return the index `i` where the peak is located. The peak is defined as the element in the array where it stops increasing and starts decreasing.

Your task is to solve this problem with a time complexity of O(log(arr.length)).

## Example

**Example 1:**

Input: `arr = [0,1,0]`

Output: `1`

**Example 2:**

Input: `arr = [0,2,1,0]`

Output: `1`

**Example 3:**

Input: `arr = [0,10,5,2]`

Output: `1`

## Constraints

- `arr.length` is between 3 and 105.
- `0 <= arr[i] <= 106`
- `arr` is guaranteed to be a mountain array.