// Given the root of a binary tree, invert the tree, and return its root.
//
// Example 1:
// Input: root = [4,2,7,1,3,6,9]
// Output: [4,7,2,9,6,3,1]

// https://leetcode.com/problems/invert-binary-tree/description/


// Definition for a binary tree node.
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

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}

public class InvertBinaryTree {
    public static void main(String[] args) {
        var root = new TreeNode(4,
                new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                new TreeNode(7, new TreeNode(6), new TreeNode(9)));
        System.out.println(invertTree(root));
    }

    public static TreeNode invertTree(TreeNode root) {

        var invertedTree = new TreeNode();

        if (root == null) return root;
        else {
            invertedTree.val = root.val;
            invertedTree.right = invertTree(root.left);
            invertedTree.left = invertTree(root.right);
        }

        return invertedTree;

    }
}
