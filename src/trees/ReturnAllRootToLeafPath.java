package trees;

import java.util.ArrayList;
import java.util.List;

public class ReturnAllRootToLeafPath {

    static List<String> find(TreeNode node)
    {
        List<String> list= new ArrayList<>();

        get(node,list,"");

        return list;
    }


    static  void get(TreeNode node, List<String> list, String ans)
    {

        if(node == null)
            return;

        ans=ans+node.value+"->";
        if(node.left == null && node.right==null)
        {
            list.add(ans.substring(0,ans.length()-2));
             return;
        }


        get(node.left,list,ans);
        get(node.right,list,ans);



    }


    public static void main(String args[])
    {
         TreeNode root=new TreeNode(1);
         TreeNode rootLeft = new TreeNode(2);
        TreeNode rootRight = new TreeNode(3);
        root.left =rootLeft;
        root.right = rootRight;
        TreeNode rootLeftRight = new TreeNode(5);
         rootLeft.right = rootLeftRight;
        System.out.println(find(root));
    }


}
