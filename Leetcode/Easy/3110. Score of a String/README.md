## 3110. Score of a String

### Click the link below for complete Explanation 👇

[Leetcode](https://leetcode.com/problems/score-of-a-string/solutions/5017346/java-easy-solution-simple-brute-force-beats/)

You are given a string ``s``. The score of a string is defined as the sum of the absolute difference between the ASCII values of adjacent characters.

Return the __score__ of ``s``.

**Example 1:**

**Input:** s = "hello" <br>
**Output:** 13

**Explanation:**

The ASCII values of the characters in s are: 'h' = 104, 'e' = 101, 'l' = 108, 'o' = 111. So, the score of s would be |104 - 101| + |101 - 108| + |108 - 108| + |108 - 111| = 3 + 7 + 0 + 3 = 13.

**Example 2:**

**Input:** s = "zaz" <br>
**Output:** 50

**Explanation:**

The __ASCII__ values of the characters in s are: 'z' = 122, 'a' = 97. So, the score of ``s`` would be |122 - 97| + |97 - 122| = 25 + 25 = 50.

**Constraints:**

- ``2 <= s.length <= 100``

- ``s consists only of lowercase English letters.``
