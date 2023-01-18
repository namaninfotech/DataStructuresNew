package javaapplication1;

import java.util.Arrays;

public class RobHouse {

    public static int find ( int[] array ) {

        int dp[] = new int[ array.length ];
        Arrays.fill ( dp, -1 );

        return check ( dp, array, array.length - 1 );
    }

    // using recursion
    public static int check ( int[] dp, int array[], int index ) {
        if ( index == 0 ) {
            return array[ index ];
        }

        if ( index < 0 ) {
            return 0;
        }

        if ( dp[ index ] != -1 ) {
            return dp[ index ];
        }

        int pick = array[ index ] + check ( dp, array, index - 2 );
        int notPick = 0 + check ( dp, array, index - 1 );

        return Math.max ( pick, notPick );
    }

    // using include-exclude
    public static int findMaximum ( int arr[] ) {
        int exc = 0;
        int inc = arr[ 0 ];

        for ( int i = 1; i < arr.length; i++ ) {

            int Ninc = exc + arr[ i ];
            int Nexc = Math.max ( inc, exc );

            inc = Ninc;
            exc = Nexc;
        }

        return Math.max ( inc, exc );

    }

    public static void main ( String args[] ) {
        int array[] = {5, 5, 10, 100, 10, 5};

        System.out.println ( find ( array ) );

        findMaximum ( array );
    }

}
