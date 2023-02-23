package by.digital.habbits.module1.leetcode.task94;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {

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

    public static class SolutionRecursively {
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> list = new ArrayList<>();
            run(list, root);
            return list;
        }

        public void run(List<Integer> list, TreeNode node) {
            if (node == null) {
                return;
            }
            run(list, node.left);
            list.add(node.val);
            run(list, node.right);
        }
    }

    public static class SolutionIteratively {
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> list = new ArrayList<>();
            Stack<TreeNode> stack = new Stack<>();
            TreeNode node = root;
            while (node != null || !stack.isEmpty()) {
                while (node != null) {
                    stack.push(node);
                    node = node.left;
                }
                list.add(stack.peek().val);
                node = stack.pop().right;
            }
            return list;
        }
    }
}
