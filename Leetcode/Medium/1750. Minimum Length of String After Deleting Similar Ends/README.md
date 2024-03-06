## 1750. Minimum Length of String After Deleting Similar Ends

### click the link below to visit the leetcode problem👇
[Leetcode problem](https://leetcode.com/problems/minimum-length-of-string-after-deleting-similar-ends/description/)

Given a string ``s`` consisting only of characters ``'a'``, ``'b'``, and ``'c'``. You are asked to apply the following algorithm on the string any number of times:

1 Pick a non-empty prefix from the string s where all the characters in the prefix are equal. <br>
2 Pick a non-empty suffix from the string s where all the characters in this suffix are equal. <br>
3 The prefix and the suffix should not intersect at any index. <br>
4 The characters from the prefix and suffix must be the same. <br>
5 Delete both the prefix and the suffix. <br>

*Return the __minimum length__ of ``s`` after performing the above operation any number of times (possibly zero times).*

**Example 1:**

**Input:** s = "ca" <br>
**Output:** 2       <br>
**Explanation:** You can't remove any characters, so the string stays as is.

**Example 2:**

**Input:** s = "cabaabac"   <br>
**Output:** 0               <br>
**Explanation:** An optimal sequence of operations is:
- Take prefix = "c" and suffix = "c" and remove them, s = "abaaba".
- Take prefix = "a" and suffix = "a" and remove them, s = "baab".
- Take prefix = "b" and suffix = "b" and remove them, s = "aa".
- Take prefix = "a" and suffix = "a" and remove them, s = "".

**Example 3:**

**Input:** s = "aabccabba"  <br>
**Output:** 3               <br>
**Explanation:** An optimal sequence of operations is:
- Take prefix = "aa" and suffix = "a" and remove them, s = "bccabb".
- Take prefix = "b" and suffix = "bb" and remove them, s = "cca".
 

**Constraints:**

- ``1 <= s.length <= 10^5``

- ``s only consists of characters 'a', 'b', and 'c'.``
