public class FindTheTownJudge {

static int find(int[][] trust,int n)
{
    boolean check[]=new boolean[n];
    int count[] = new int[n];


    for(int i=0;i<trust.length;i++)
    {
        int value= trust[i][0];

        check[value-1]=true;

        int to = trust[i][1];
        count[to-1]=count[to-1]+1;
    }

    for(int i=0;i<check.length;i++)
    {
        if(!check[i] && count[i]==n-1)
            return i+1;
    }

    return -1;
}

public static void main(String args[])
{
  int trust[][] = {{1,3},{1,4},{2,3},{2,4},{4,3}};
  int n=4;
  System.out.println(find(trust,n));
}

}
