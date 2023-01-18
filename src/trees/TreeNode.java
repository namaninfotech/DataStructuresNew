package trees;

public class TreeNode {
    TreeNode left;
    TreeNode right;
    int value;

    TreeNode(int value)
    {
        this.value=value;
    }

    TreeNode(TreeNode left, TreeNode right, int value) {
        this.left = left;
        this.right = right;
        this.value = value;
    }
}
