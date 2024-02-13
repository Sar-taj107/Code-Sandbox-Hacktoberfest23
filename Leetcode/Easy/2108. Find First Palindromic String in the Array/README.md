## Find First Palindromic String in the Array

Given an array of strings ```words```, return the first __palindromic string__ in the array. If there is no such string, return an __empty string__ ```""```.

A string is palindromic if it reads the same forward and backward.

 

**Example 1:**
**
**Input:** words = ["abc","car","ada","racecar","cool"] <br>
**Output:** "ada"                                       <br>
**Explanation:** The first string that is palindromic is "ada".
Note that "racecar" is also palindromic, but it is not the first.

**Example 2:**
**
**Input:** words = ["notapalindrome","racecar"] <br>
**Output:** "racecar"                           <br>
**Explanation:** The first and only string that is palindromic is "racecar".

**Example 3:**
**
**Input:** words = ["def","ghi"]                <br>
**Output:** ""                                  <br>
**Explanation:** There are no palindromic strings, so the empty string is returned.
 

**Constraints:**

- ```1 <= words.length <= 100```

- ```1 <= words[i].length <= 100```

- ```words[i]``` consists only of lowercase English letters.