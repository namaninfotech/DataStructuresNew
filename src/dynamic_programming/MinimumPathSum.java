package dynamic_programming;

//Starting from BottomRight
//Next step to Left side

public class MinimumPathSum {

    static int find(int[][] path)
    {
        int n=path.length;
        int m = path[0].length;
        int[][] sum = new int[n][m];

        for(int i=n-1;i>=0;i--)
        {
            for(int j=m-1;j>=0;j--)
            {
                if(j==m-1 && i==n-1)
                {
                    sum[i][j]=path[i][j];
                }
                else if(i==n-1)
                {
                    System.out.println("called second");
                    sum[i][j]=path[i][j]+sum[i][j+1];
                }
                else if(j==m-1)
                {
                    System.out.println("called third");
                    sum[i][j]=path[i][j]+sum[i+1][j];
                }
                else{
                    sum[i][j]=path[i][j]+Math.min(sum[i+1][j],sum[i][j+1]);
                }

            }
        }

        for(int i=0;i<=n-1;i++)
        {
            for(int j=0;j<=m-1;j++)
            {
                System.out.print(sum[i][j]+", ");
            }
            System.out.println();
        }

        return sum[0][0];
    }

    public static void main(String args[])
    {
        int[][] path = {{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(find(path));
    }
}
