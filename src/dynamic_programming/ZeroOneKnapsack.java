package dynamic_programming;

public class ZeroOneKnapsack {

    static int find(int[] values,int[] weights, int capacity)
    {
        int dp[][]=new int[values.length+1][capacity+1];

        for(int i=0;i<=values.length;i++)
        {
            for(int j=0;j<=capacity;j++)
            {
                if(i==0)
                {
                    dp[i][j]=0;
                }
                else if(j==0)
                {
                    dp[i][j]=0;
                }
                else if(weights[i-1]>j)
                {
                    dp[i][j]=dp[i-1][j];
                }
                else{

                    dp[i][j]=Integer.max(dp[i-1][j],(dp[i-1][j-weights[i-1]]+values[i-1]));
                }

            }
        }


        return dp[values.length][capacity];
    }

    public static void main(String args[])
    {
        int[] weights={2,5,1,3,4};
        int[] values={15,14,10,45,30};
        int capacity=7;

        System.out.println(find(values,weights,capacity));
    }
}
