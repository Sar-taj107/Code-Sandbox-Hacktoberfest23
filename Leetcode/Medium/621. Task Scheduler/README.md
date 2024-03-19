## 621. Task Scheduler

### Click the link below to visit the problem 👇

[Leetcode solution](https://leetcode.com/problems/task-scheduler/)

You are given an array of CPU ``tasks``, each represented by letters ``A to Z``, and a cooling time, ``n``. Each cycle or interval allows the completion of one task. Tasks can be completed in any order, but there's a constraint: __identical__ tasks must be separated by at least n intervals due to cooling time.

*​Return the __minimum number__ of intervals required to complete all tasks.*

 

**Example 1:**

**Input:** tasks = ["A","A","A","B","B","B"], n = 2 <br>
**Output:** 8  <br>
**Explanation:** A possible sequence is: A -> B -> idle -> A -> B -> idle -> A -> B.

After completing task A, you must wait two cycles before doing A again. The same applies to task B. In the 3rd interval, neither A nor B can be done, so you idle. By the 4th cycle, you can do A again as 2 intervals have passed.

**Example 2:**

**Input:** tasks = ["A","C","A","B","D","B"], n = 1  <br>
**Output:** 6  <br>
**Explanation:** A possible sequence is: A -> B -> C -> D -> A -> B.

With a cooling interval of 1, you can repeat a task after just one other task.

**Example 3:**

**Input:** tasks = ["A","A","A", "B","B","B"], n = 3  <br>
**Output:** 10 <br>
**Explanation:** A possible sequence is: A -> B -> idle -> idle -> A -> B -> idle -> idle -> A -> B.

There are only two types of tasks, A and B, which need to be separated by 3 intervals. This leads to idling twice between repetitions of these tasks.

 

**Constraints:**

- ``1 <= tasks.length <= 10^4``

- ``tasks[i] is an uppercase English letter.``

- ``0 <= n <= 100``