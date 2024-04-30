## 1915. Number of Wonderful Substrings

### Click the link below for complete Explanation

[Leetcode solution]()

A wonderful string is a ``string`` where at most one letter appears an odd number of times.

For example, ``"ccjjc"`` and ``"abab"`` are wonderful, but ``"ab"`` is not.
Given a string word that consists of the first ten lowercase English letters ('a' through 'j'), return the number of wonderful non-empty substrings in word. If the same substring appears multiple times in word, then count each occurrence separately.

A __substring__ is a contiguous sequence of characters in a string.

 

**Example 1:**

**Input:** word = "aba" <br>
**Output:** 4

**Explanation:** The four wonderful substrings are underlined below:
- "aba" -> "a"
- "aba" -> "b"
- "aba" -> "a"
- "aba" -> "aba"

**Example 2:**

**Input:** word = "aabb"
**Output:** 9
**Explanation:** The nine wonderful substrings are underlined below:
- "aabb" -> "a" <br>
- "aabb" -> "aa" <br>
- "aabb" -> "aab" <br>
- "aabb" -> "aabb" <br>
- "aabb" -> "a"   <br> 
- "aabb" -> "abb" <br>
- "aabb" -> "b" <br>
- "aabb" -> "bb" <br>
- "aabb" -> "b"

**Example 3:**
**
**Input:** word = "he"
**Output:** 2
**Explanation:** The two wonderful substrings are underlined below:
- "he" -> "h" <br>
- "he" -> "e"
 

**Constraints:**

- ``1 <= word.length <= 105``

- ``word consists of lowercase English letters from 'a' to 'j'.``