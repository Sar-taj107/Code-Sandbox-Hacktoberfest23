## 1219. Path with Maximum Gold

### Click the link below for complete Explanation 👇✅🔥

[Leetcode](https://leetcode.com/problems/path-with-maximum-gold/solutions/)

In a ``gold`` mine grid of size ``m x n``, each cell in this mine has an integer representing the amount of ``gold`` in that cell, 0 if it is ``empty``.

Return *the __maximum__ amount of gold you can collect under the conditions*:

- Every time you are located in a cell you will collect all the gold in that cell.

- From your position, you can walk one step to the left, right, up, or down.

- You can't visit the same cell more than once.

- Never visit a cell with 0 gold.

- You can start and stop collecting gold from any position in the grid that has some gold.
 

**Example 1:**

**Input:** grid = [[0,6,0],[5,8,7],[0,9,0]] <br>
**Output:** 24 <br>
**Explanation:** <br>
[[0,6,0], <br>
 [5,8,7], <br>
 [0,9,0]]

Path to get the maximum gold, 9 -> 8 -> 7.

**Example 2:**

**Input:** grid = [[1,0,7],[2,0,6],[3,4,5],[0,3,0],[9,0,20]] <br>
**Output:** 28 <br>
**Explanation:** <br>
[[1,0,7], <br>
 [2,0,6], <br>
 [3,4,5], <br>
 [0,3,0], <br>
 [9,0,20]]

Path to get the maximum gold, 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7.
 

**Constraints:**

- ``m == grid.length``

- ``n == grid[i].length``

- ``1 <= m, n <= 15``

- ``0 <= grid[i][j] <= 100``

- ``There are at most 25 cells containing gold.``
