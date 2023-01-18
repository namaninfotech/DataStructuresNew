package System.out;

import java.util.HashMap;
import java.util.Map;

public class PartitionEqualSubsetSumWithDP {

    public static boolean result ( int array[], int target ) {

        boolean dp[][] = new boolean[ array.length + 1 ][ target + 1 ];

        for ( int i = 0; i < dp.length; i++ ) {
            for ( int j = 0; j < dp[ i ].length; j++ ) {
                if ( i == 0 && j == 0 ) {
                    dp[ i ][ j ] = true;
                } else if ( i == 0 ) {
                    dp[ i ][ j ] = false;
                } else if ( j == 0 ) {
                    dp[ i ][ j ] = true;
                } else {

                    if ( dp[ i - 1 ][ j ] ) {
                        dp[ i ][ j ] = true;
                    } else {
                        int val = array[ i - 1 ];
                        if ( j >= val ) {
                            if ( dp[ i - 1 ][ j - val ] == true ) {
                                dp[ i ][ j ] = true;
                            }
                        }
                    }

                }

            }

        }
        
        return dp[array.length][target];

    }

    public static void main ( String args[] ) {
        int array[] = {1, 5, 11, 1};

        System.out.println ( result ( array, 11 ) );
       
    }
}
