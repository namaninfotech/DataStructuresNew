package dynamic_programming;

import java.util.Arrays;

public class ClimbingStairs {


    static int find(int n)
    {
        int[] memo=new int[n+1];
        Arrays.fill(memo,0);
        return count(n,memo);
    }

    static int count(int n,int[] memo)
    {
        if(n==0)
            return 1;
        if(n<0)
            return 0;

        if(memo[n]>0)
            return memo[n];

        int first = count(n-1,memo);
        int second = count(n-2,memo);
        //int third =count(n-3,memo);

        int cp = first+second;//+third;
        memo[n]=cp;
        return cp;
    }

    public static void main(String args[])
    {
        int n=2;
        System.out.println(find(n));
    }
}
