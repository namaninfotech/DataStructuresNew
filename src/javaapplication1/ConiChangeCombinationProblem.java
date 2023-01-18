package javaapplication1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConiChangeCombinationProblem {

    private static void count ( int coins[], int size, int value ) {

        int temp[] = new int[ value + 1 ];
        temp[ 0 ] = 1;

        for ( int i = 0; i < size; i++ ) {
            System.out.println ( "-----------------------------------------" );
            for ( int j = coins[ i ]; j < temp.length; j++ ) {
                temp[ j ] += temp[ j - coins[ i ] ];

                for ( int k = 0; k < temp.length; k++ ) {
                    System.out.print ( temp[ k ] + "\t" );
                }
                System.out.println ();

            }

        }

        System.out.println ( "COUNT=" + temp[ temp.length - 1 ] );
    }

    public static void main ( String args[] )
            throws IOException {

        BufferedReader br = new BufferedReader ( new InputStreamReader ( System.in ) );
        System.out.print ( "please enter size of an array=" );
        int size = Integer.parseInt ( br.readLine () );
        int coins[] = new int[ size ];
        for ( int i = 0; i < size; i++ ) {
            int value = Integer.parseInt ( br.readLine () );

            coins[ i ] = value;
        }

        System.out.print ( "please enter Value" );
        int value = Integer.parseInt ( br.readLine () );

        count ( coins, size, value );
    }
}
