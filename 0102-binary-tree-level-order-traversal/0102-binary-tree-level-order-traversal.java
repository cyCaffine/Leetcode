import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public void LO(TreeNode root, List<List<Integer>> ans) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        List<Integer> temp = new ArrayList<>();
        
        while (!q.isEmpty()) {
            TreeNode curr = q.remove();
            if (curr == null) {
                ans.add(new ArrayList<>(temp)); // Add a copy of temp to ans
                temp.clear(); // Clear temp for the next level
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                temp.add(curr.val);
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        LO(root, ans);
        return ans;
    }
}
