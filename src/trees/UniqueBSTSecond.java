package trees;

import java.util.ArrayList;
import java.util.List;

public class UniqueBSTSecond {

    public static List<TreeNode> generateTrees(int n) {

        return helper(1,n);
    }


    public static List<TreeNode> helper(int start, int end)
    {
        if(start>end)
        {
            List<TreeNode> base=new ArrayList<>();
            base.add(null);
            return base;
        }
         List<TreeNode> ans=new ArrayList<>();
        for(int i=start;i<=end;i++)
        {
            List<TreeNode> left=helper(start,i-1);
            List<TreeNode> right=helper(i+1,end);

            for(TreeNode l:left)
            {
                for (TreeNode r:right)
                {
                   TreeNode node=new TreeNode(i);
                   node.left=l;
                   node.right=r;
                   ans.add(node);
                }
            }

        }

   return ans;
    }


    public static void main(String args[])
    {
      int n=3;

      System.out.println(generateTrees(n));
    }
}
