package by.digital.habbits.module1.leetcode.task101;

import java.util.Stack;

public class SymmetricTree {

    public static class TreeNode {
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
        public boolean isSymmetric(TreeNode root) {
            if (root == null) return true;
            Stack<TreeNode> stack = new Stack<>();
            stack.push(root.left);
            stack.push(root.right);
            while (!stack.empty()) {
                TreeNode leftNode = stack.pop();
                TreeNode rightNode = stack.pop();
                if (leftNode == null && rightNode == null) {
                    continue;
                }
                if (leftNode == null || rightNode == null || leftNode.val != rightNode.val) {
                    return false;
                }
                stack.push(leftNode.left);
                stack.push(rightNode.right);
                stack.push(leftNode.right);
                stack.push(rightNode.left);
            }
            return true;
        }
    }
}
