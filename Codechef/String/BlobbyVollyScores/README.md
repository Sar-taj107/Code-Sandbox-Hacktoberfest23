## Blobby Volly Scores
![problem link:](https://www.codechef.com/practice/course/strings/STRINGS/problems/BLOBBYVOLLEY)

Alice and Bob are playing a game of Blobby Volley. In this game, in each turn, one player is the server and the other player is the receiver. Initially, Alice is the server, and Bob is the receiver.

If the server wins the point in this turn, their score increases by 1, and they remain as the server for the next turn.
But if the receiver wins the point in this turn, their score does not increase. But they become the server in the next turn.
In other words, your score increases only when you win a point when you are the server.
Please see the Sample Inputs and Explanation for more detailed explanation.

They start with a score of 0 each, and play N turns. The winner of each of those hands is given to you as a string consisting of 'A's and 'B's. 'A' denoting that Alice won that point, and 'B' denoting that Bob won that point. Your job is the find the score of both of them after the 
N turns.

**Input Format**
- The first line of input will contain a single integer T, denoting the number of test cases.
- Each test case consists of two lines of input.
- The first line of each test case contains one integer N — the number of turns.
- The line contains a string S of length N.
- If the ℎ ith character of this string is 'A', then Alice won that point.
- If the ℎ ith character of this string is 'B', then Bob won that point.

**Output Format**

For each test case, output on a new line, two space-separated integers - Alice's final score, and Bob's final score.

Constraints
1 ≤ T ≤ 1000
1≤ N ≤1000
Length of ∣S∣ = N S consists only of the characters 'A' and 'B'.

**Sample 1:** <br>
**Input** <br>

4 <br>
3<br>
AAA<br>
4<br>
BBBB<br>
5<br>
ABABB<br>
5<br>
BABAB<br>
**Output**

3 0<br>
0 3<br>
1 1<br>
0 0<br>

**Explanation:**<br>
**Testcase 1:** The given string is "AAA".

- Score is 0, 0. <br>
- Turn 1. Alice is the server, and Bob is the receiver. Alice wins. <br>
- Score is 1, 0.<br>
- Turn 2. Alice is the server, and Bob is the receiver. Alice wins.<br>
- Score is 2, 0.<br>
- Turn 3. Alice is the server, and Bob is the receiver. Alice wins.<br>
- Score is 3, 0.<br>
- This is the final score, and so the output is 3 0.

**Testcase 3:** The given string is "ABABB".


- Score is 0, 0.<br>
- Turn 1. Alice is the server, and Bob is the receiver. Alice wins.<br>
- Score is 1, 0.<br>
- Turn 2. Alice is the server, and Bob is the receiver. Bob wins.<br>
- Score is 1, 0. [Note that Bob's score doesn't increase]<br>
- Turn 3. Bob is the server, and Alice is the receiver. Alice wins.<br>
- Score is 1, 0. [Note that Alice's score doesn't increase]<br>
- Turn 4. Alice is the server, and Bob is the receiver. Bob wins.<br>
- Score is 1, 0. [Note that Bob's score doesn't increase]<br>
- Turn 5. Bob is the server, and Alice is the receiver. Bob wins.<br>
- Score is 1, 1.<br>
- This is the final score, and so the output is 1 1.

**Testcase 4:** The given string is "BABAB".

- Score is 0, 0.<br>
- Turn 1. Alice is the server, and Bob is the receiver. Bob wins.<br>
- Score is 0, 0.<br>
- Turn 2. Bob is the server, and Alice is the receiver. Alice wins.<br>
- Score is 0, 0.<br>
- Turn 3. Alice is the server, and Bob is the receiver. Bob wins.<br>
- Score is 0, 0.<br>
- Turn 4. Bob is the server, and Alice is the receiver. Alice wins.<br>
- Score is 0, 0.<br>
- Turn 5. Alice is the server, and Bob is the receiver. Bob wins.<br>
- Score is 0, 0.<br>
- This is the final score, and so the output is 0 0.