package org.leetcode.solved;

/*
You are given the root of a binary tree that consists of exactly 3 nodes:
the root, its left child, and its right child.

Return true if the value of the root is equal to the sum of the values of its two children,
or false otherwise.
* */

public class RootEqualsSumOfChildren {
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
        public boolean checkTree(TreeNode root) {
            if (root.left.val + root.right.val == root.val) {
                return true;
            }
            return false;
        }
    }
}
