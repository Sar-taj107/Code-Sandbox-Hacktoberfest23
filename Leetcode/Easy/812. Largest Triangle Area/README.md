## Largest Triangle Area

Given an array of points on the __X-Y__ plane points where ```points[i] = [xi, yi]```, return the area of the largest triangle that can be formed by any three different points. Answers within 10^-5 of the actual answer will be accepted.

 

**Example 1:**

![](https://s3-lc-upload.s3.amazonaws.com/uploads/2018/04/04/1027.png)

**Input:** points = [[0,0],[0,1],[1,0],[0,2],[2,0]] <br>
**Output:** 2.00000                                 <br>
**Explanation:** The five points are shown in the above figure. The red triangle is the largest.

**Example 2:**

**Input:** points = [[1,0],[0,0],[0,1]] <br>
**Output:** 0.50000                     <br>

**Constraints:**

- ```3 <= points.length <= 50```

- ```-50 <= xi, yi <= 50```

- ```All the given points are unique.```
