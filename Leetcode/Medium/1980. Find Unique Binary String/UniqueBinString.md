# 1980. Find Unique Binary String
- leetcode link : https://leetcode.com/problems/find-unique-binary-string/

Given an array of strings nums containing n unique binary strings each of length n, return a binary string of length n that does not appear in nums. If there are multiple answers, you may return any of them.

 

**Example** 1:

**Input**: nums = ["01","10"] <br>
**Output**: "11"  <br>
**Explanation**: "11" does not appear in nums. "00" would also be correct.

**Example** 2: <br>
**Input**: nums = ["00","01"]  <br>
**Output**: "11"  <br>
**Explanation**: "11" does not appear in nums. "10" would also be correct.

**Example** 3: <br>
**Input**: nums = ["111","011","001"] <br>
**Output**: "101"  <br>
**Explanation**: "101" does not appear in nums. "000", "010", "100", and "110" would also be correct.
 

**Constraints:**

- ```n == nums.length```
- ```1 <= n <= 16```
- ```nums[i].length == n```
- ```nums[i] is either '0' or '1'.```
- ```All the strings of nums are unique.```
