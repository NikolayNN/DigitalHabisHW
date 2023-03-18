package by.digital.habbits.module1.leetcode.task104;

public class MaximumDepthBinaryTree {

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

    public static class Solution {
        public int maxDepth(TreeNode root) {
            if (root == null) {
                return 0;
            } else {
                int leftDepth = maxDepth(root.left);
                int rightDepth = maxDepth(root.right);
                return Math.max(leftDepth, rightDepth) + 1;
            }
        }
    }
}
