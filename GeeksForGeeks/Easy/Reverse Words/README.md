## Reverse Words

Given a String ``str``, reverse the string without reversing its individual words. Words are separated by dots.

Note: The last character has not been '.'. 

**Examples :**
**
**Input:** str = i.like.this.program.very.much <br>
**Output:** much.very.program.this.like.i <br>

**Explanation:** After reversing the whole string(not individual words), the input string becomes much.very.program.this.like.i

**Input:** str = pqr.mno <br>
**Output:** mno.pqr

**Explanation:** After reversing the whole string , the input string becomes mno.pqr
Expected Time Complexity: O(|str|)
Expected Auxiliary Space: O(|str|)

**Constraints:**

- ``1 <= |str| <= 10^5``