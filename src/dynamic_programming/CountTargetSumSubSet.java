package dynamic_programming;

//Need to be complete
public class CountTargetSumSubSet {

    static boolean find(int[] arr,int target)
    {
        boolean[][] dp=new boolean[arr.length+1][target+1];


        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                if(i==0 && j==0)
                {
                    dp[i][j]=true;
                }
                else if(i == 0)
                {
                    dp[i][j]=false;
                }
                else if(j==0)
                {
                    dp[i][j]=true;
                }
                else
                {
                    if(dp[i-1][j])
                        dp[i][j]=true;
                    else{
                        int value=arr[i-1];

                        if(value<=j)
                            dp[i][j]=dp[i-1][j-arr[i-1]];
                    }
                }

            }
        }
        return dp[dp.length-1][target-1];
    }

    public static void main(String args[])
    {
        int arr[]={3, 34, 4, 12, 5, 2};
        int target=10;
        System.out.println(find(arr,target));

    }


}
