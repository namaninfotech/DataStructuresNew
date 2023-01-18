package javaapplication1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CoinChangeProblem {

    public static int find ( int array[], int target ) {

        Arrays.sort ( array );

        int dp[] = new int[ target + 1 ];

        dp[ 0 ] = 0;
        for ( int i = 1; i <= target; i++ ) {
            dp[ i ] = Integer.MAX_VALUE;
        }

        for ( int i = 1; i <= target; i++ ) {
            for ( int j = 0; j < array.length; j++ ) {

                if ( array[ j ] <= i ) {
                    int curr = dp[ i - array[ j ] ];
                    if(curr!=Integer.MAX_VALUE && curr+1<dp[i])
                        dp[i]=curr+1;
                }

            }
        }

        return dp[target];
    }

    public static void main ( String args[] ) {

        int array[] = {186, 419, 83, 408};
        int target = 6249;
        System.out.println ( find ( array, target ) );

    }
}
