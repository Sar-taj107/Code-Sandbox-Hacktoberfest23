import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LevelOrderTraversal {
  
  public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
  
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();
        LinkedList<TreeNode> que = new LinkedList<>();
        que.addLast(root);
        List<List<Integer>> ans = new ArrayList<>();
        while (que.size() != 0) {
            int size = que.size();
            List<Integer> smallAns = new ArrayList<>();

            while (size-- > 0) {
                TreeNode rNode = que.removeFirst();
                smallAns.add(rNode.val);

                if (rNode.left != null) que.addLast(rNode.left);
                if (rNode.right != null) que.addLast(rNode.right);
            }
            ans.add(smallAns);
        }
        return ans;
    }

  public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        LevelOrder levelOrder = new LevelOrder();

        List<List<Integer>> result = levelOrder.levelOrder(root);

        for (List<Integer> level : result) {
            System.out.println(level);
        }
    }
}
