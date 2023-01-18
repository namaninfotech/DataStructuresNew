package trees;

public class ValidBST {

    static boolean isValid(TreeNode root)
    {
        //return check(root, root.value) ;
      return range(root,Long.MAX_VALUE,Long.MIN_VALUE);
    }


    static boolean range(TreeNode root,long max,long min)
    {
        if(root==null)
            return true;

        if(root.value<=min || root.value>=max)
            return false;

        return range(root.left,root.value,min ) && range(root.right,max, root.value);
    }

    static boolean check(TreeNode root, int rootValue)
    {
        if(root==null)
            return true;

        if(root.right!=null && root.value>root.right.value)
        {
            return false;
        }

        if(root.left!=null&&root.value<root.left.value)
        {
            return  false;
        }

        return check(root.left, rootValue) && check(root.right,rootValue);
    }


    public static void main(String args[])
    {
        //root
        TreeNode root=new TreeNode(15);
        TreeNode left=new TreeNode(11);
        TreeNode right=new TreeNode(60);
        root.left=left;
        root.right=right;

        //root left
        TreeNode leftLeft=new TreeNode(80);
        TreeNode leftRight=new TreeNode(13);
        left.left=leftLeft;
        left.right=leftRight;


       System.out.println(isValid(root));
    }
}
