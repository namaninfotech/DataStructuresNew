package dynamic_programming;

public class NumberOfPalindromicSubstrings {

    static int find(String s)
    {
        int count =0;

        boolean dp[][]=new boolean[s.length()][s.length()];
        for(int gap=0;gap<s.length();gap++)
        {
            for(int i=0,j=gap;j<s.length();i++,j++)
            {
               if(gap==0)
               {
                   dp[i][j]=true;
                   count++;
               }
               else if(gap==1)
               {
                   dp[i][j]= s.charAt(i)==s.charAt(j);
                   if(dp[i][j])
                       count++;
               }
               else{
                   if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1])
                   {
                       dp[i][j]=true;
                       count++;
                   }
                   else{
                       dp[i][j]=false;
                   }
               }
            }
        }


        return count;
    }

    public static void main(String args[])
    {
        String s="aaa";
        System.out.println(find(s));
    }
}
