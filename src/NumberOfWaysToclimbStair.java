
import java.util.Arrays;


public class NumberOfWaysToclimbStair {

    public static int find ( int n ) {
        
        int dp[]=new int[n+1];
        Arrays.fill ( dp, -1);
        check (  n,dp );
        
        for(int i=0;i<dp.length;i++)
            System.out.print(dp[i]+",");
        
        System.out.println();
        return dp[n];
    }
    
    //MEMOIZATION
    public static int check (  int n, int dp[]) {
        
        
        
        if (  n ==0 ) {
            return 1;
        }
        if(n<0)
            return 0;
        
        if(dp[n] !=-1)
            return dp[n];
        
       

        dp[n]=check (  n-1,dp ) + check (  n-2 ,dp);
       return dp[n];
        

    }
    

    //RECURSION APPROACH
//    public static void check (  int n, int count ) {
//        
//        
//        if ( count > n ) {
//            return;
//        }
//        if ( count == n ) {
//            
//            ways++;
//            return;
//        }
//
//        check (  n, count + 1 );
//        check (  n, count + 2 );
//
//    }

    public static void main ( String args[] ) {
        int n = 5;
        System.out.println ( find ( n ) );
    }
}
