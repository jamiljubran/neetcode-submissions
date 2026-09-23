/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot == null) return true;   // empty tree is always a subtree
        if (root == null) return false;     // nothing left to search

        if (sameTree(root, subRoot)) return true;

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    private boolean sameTree(TreeNode a, TreeNode b) {
        if (a == null && b == null) return true;   // both ran out together
        if (a == null || b == null) return false;  // one ran out early
        if (a.val != b.val) return false;

        return sameTree(a.left, b.left) && sameTree(a.right, b.right);
    }
}
