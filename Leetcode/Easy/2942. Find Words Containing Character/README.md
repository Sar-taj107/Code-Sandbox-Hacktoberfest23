## Find Words Containing Character

You are given a __0-indexed__ array of strings ```words``` and a character ```x```.

- Return an array of indices representing the words that contain the character ```x```.

- __Note__ that the returned array may be in __any order__.

 

**Example 1:**

**Input:** words = ["leet","code"], x = "e"       <br>
**Output:** [0,1]                                 <br>
**Explanation:** "e" occurs in both words: "leet", and "code". Hence, we return indices 0 and 1.

**Example 2:**

**Input:** words = ["abc","bcd","aaaa","cbc"], x = "a" <br>
**Output:** [0,2]                                      <br>
**Explanation:** "a" occurs in "abc", and "aaaa". Hence, we return indices 0 and 2.

**Example 3:**

**Input:** words = ["abc","bcd","aaaa","cbc"], x = "z" <Br>
**Output:** []                                         <br>
**Explanation:** "z" does not occur in any of the words. Hence, we return an empty array.


**Constraints:**

- ```1 <= words.length <= 50```

- ```1 <= words[i].length <= 50```

- ```x``` is a lowercase English letter.

- ```words[i]``` consists only of lowercase English letters.
