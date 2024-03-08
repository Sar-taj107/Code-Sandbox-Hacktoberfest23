## Check whether the Third string is superset of String first and second.

- __Company: TCS__ <br>
- __EXAM: TCS TAG coding Test__ <br>
- __DATE: 08-03-24 Friday__ <br>
- __Type: Medium taged__ <br>

**Q:** 
Write a program to determine if string R is a superset of strings P and Q while preserving their order. In other words, check if all characters in strings P and Q appear in string R in the same order as they do in the respective strings P and Q. If the condition is met, return true; otherwise, return false.

__Suppose we have:__

- String P: "abc"
- String Q: "def"
- String R: "adbcef"
Now, let's analyze:

String P: "abc"

Characters: 'a', 'b', 'c'
String Q: "def"

Characters: 'd', 'e', 'f'
String R: "adbcef"

We need to check if all characters of P and Q appear in R in the same order as they do in P and Q.
In R, we see that 'a' appears before 'd', which matches the order in P and Q.
Then 'b' appears after 'a', which also matches the order in P.
Similarly, 'c' appears after 'b' in R, which matches the order in P.
Likewise, 'd', 'e', and 'f' appear in the same order as they do in Q.
So, in this case, R is indeed a superset of both P and Q while preserving their order. Therefore, the program should return true.