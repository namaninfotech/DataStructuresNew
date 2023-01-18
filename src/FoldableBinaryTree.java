
class Node {
    int data;
    Node left;
    Node right;

    Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}


public class FoldableBinaryTree {

    static boolean isFoldable(Node root) {
        return check(root.left, root.right);
    }

    static boolean check(Node n1, Node n2) {
        if (n1 == null && n2 == null)
            return true;

        if (n1 == null || n2 == null) {
            return false;
        }

        return check(n1.left, n2.right) && check(n1.right, n2.left);
    }


    public static void main(String args[]) {
        Node root = new Node(10, new Node(11, null, new Node(12, null, null)),
                new Node(13, new Node(14, null, null), new Node(14, null, null))
        );

        System.out.println(isFoldable(root));
    }
}
