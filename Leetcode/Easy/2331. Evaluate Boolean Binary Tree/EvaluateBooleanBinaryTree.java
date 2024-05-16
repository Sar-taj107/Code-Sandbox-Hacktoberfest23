//package Easy.2331. Evaluate Boolean Binary Tree;

public class EvaluateBooleanBinaryTree {
    class Solution {
        public boolean evaluateTree(TreeNode root) {
            
            if(root.left ==null && root.right == null){
                return root.val !=0;
            }
    
            if(root.val == 2){
                return  evaluateTree(root.left) | evaluateTree(root.right);
            }
            return evaluateTree(root.left) & evaluateTree(root.right);
        }
    }
}

/*
Output:
Input: root = [2,1,3,null,null,0,1]
Output: true

*/
