/*
515. Find Largest Value in Each Tree Row
Given the root of a binary tree, return an array of the largest value in each row of the tree (0-indexed).

Example-1:
Input: root = [1,3,2,5,3,null,9]
Output: [1,3,9]

Example 2:
Input: root = [1,2,3]
Output: [1,3]

Constraints:
The number of nodes in the tree will be in the range [0, 10^4].
-2^31 <= Node.val <= 2^31 - 1

*/

 /* using BFS
t.c=o(n) n=no of nodes
s.c=o(n)
 */
public class Solution 
{
    public List<Integer> largestValues(TreeNode root) 
    {

        if (root == null)
            return new ArrayList<>();

        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) 
        {
            int n = queue.size();
            int maxEl = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) 
            {
                TreeNode node = queue.poll();
                maxEl = Math.max(maxEl, node.val);
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
            }

            res.add(maxEl);
        }

        return res;
    }
}



 /*
 using dfs
t.c=o(n)
s.c=o(depth)
 */
public class Solution 
{
    List<Integer> res = new ArrayList<>();

    public List<Integer> largestValues(TreeNode root) 
    {
        dfs(root, 0);
        return res;
    }

    private void dfs(TreeNode root, int depth) 
    {
        if (root == null)
            return;
        
        if (depth == res.size()) 
        {
            res.add(root.val);
        } 
        else 
        {
            res.set(depth, Math.max(res.get(depth), root.val));
        }

        dfs(root.left, depth + 1);
        dfs(root.right, depth + 1);
    }
}
