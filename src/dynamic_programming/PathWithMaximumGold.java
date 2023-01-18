package dynamic_programming;

//Starting from TopRight
//Next step to bottom

public class PathWithMaximumGold {

    static int find(int path[][])
    {
        int n=path.length;
        int m=path[0].length;
        int maximum=0;


        if(n==1)
        {
            int s=0;
            for(int i=0;i<m;i++)
            {
                s+=path[0][i];
            }
            return s;
        }

        int sum[][]=new int[n][m];

        for(int i=m-1;i>=0;i--)
        {
            for(int j=0;j<n;j++)
            {
                if(i==m-1)
                {
                    sum[j][i]=path[j][i];
                }
                else if(i!=m-1 && j==0)
                {
                    sum[j][i]=path[j][i]+Math.max(sum[j][i+1],sum[j+1][i+1]);
                }
                else if(i!=m-1 && j==n-1)
                {
                    sum[j][i]=path[j][i]+Math.max(sum[j][i+1],sum[j-1][i+1]);
                }
                else{
                    sum[j][i]=path[j][i]+Math.max(Math.max(sum[j][i+1],sum[j-1][i+1]),sum[j+1][i+1]);
                }
            }
        }

        for(int i=0;i<n;i++)
        {
            if(sum[i][0]>maximum)
                maximum=sum[i][0];
        }

        return maximum;
    }

    public static void main(String args[])
    {
        int path[][]={{1, 3, 3},
                {2, 1, 4},
                {0, 6, 4}};
        System.out.println(find(path));
    }
}
