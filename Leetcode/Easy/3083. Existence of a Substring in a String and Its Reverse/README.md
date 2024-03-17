## 3083. Existence of a Substring in a String and Its Reverse

### click the link below for complete expalnation 👇

[Leetcode solution](https://leetcode.com/problems/existence-of-a-substring-in-a-string-and-its-reverse/solutions/4889462/simple-java-solution-hashmap-2-approaches-substring/)

Given a string ``s``, find any 
``substring``
 of length 2 which is also present in the reverse of ``s``.

Return ``true`` if such a substring exists, and ``false`` otherwise.

 

**Example 1:**

**Input:** s = "leetcode" <br>
**Output:** true  <br>
**Explanation:** Substring "ee" is of length 2 which is also present in reverse(s) == "edocteel".

**Example 2:**

**Input:** s = "abcba" <br>
**Output:** true <br>
**Explanation:** All of the substrings of length 2 "ab", "bc", "cb", "ba" are also present in reverse(s) == "abcba".

**Example 3:**

**Input:** s = "abcd" <br>
**Output:** false  <br>
**Explanation:** There is no substring of length 2 in s, which is also present in the reverse of s.

 

**Constraints:**

``1 <= s.length <= 100``

``s consists only of lowercase English letters.``