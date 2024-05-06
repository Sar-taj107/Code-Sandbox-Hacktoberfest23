## 2487. Remove Nodes From Linked List

### Click the link below for complete Explanation 👇✅

[Leetcode Solution](https://leetcode.com/problems/remove-nodes-from-linked-list/solutions/5120363/java-solution-3-approaches-stack-recursion/)

You are given the ``head`` of a linked list.

Remove every node which has a node with a greater value anywhere to the ``right`` side of it.

Return *the head of the modified linked list*.

 

**Example 1:**

![](https://assets.leetcode.com/uploads/2022/10/02/drawio.png)

**Input:** head = [5,2,13,3,8] <br>
**Output:** [13,8] <br>
**Explanation:** The nodes that should be removed are 5, 2 and 3.
- Node 13 is to the right of node 5.
- Node 13 is to the right of node 2.
- Node 8 is to the right of node 3.

**Example 2:**

**Input:** head = [1,1,1,1] <br>
**Output:** [1,1,1,1] <br>
**Explanation:** Every node has value 1, so no nodes are removed.
 

**Constraints:**

- ``The number of the nodes in the given list is in the range [1, 10^5].``

- ``1 <= Node.val <= 10^5``