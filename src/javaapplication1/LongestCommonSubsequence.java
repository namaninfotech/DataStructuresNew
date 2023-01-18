/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

public class LongestCommonSubsequence {

    private static int getMaxLength ( String s1, String s2 ) {
        int maxLength = 0;

        int dp[][] = new int[ s1.length () + 1 ][ s2.length () + 1 ];

        for ( int i = 0; i < s1.length () + 1; i++ ) {

            for ( int j = 0; j < s2.length () + 1; j++ ) {
                dp[ i ][ j ] = 0;
            }
        }

        for ( int i = s1.length () - 1; i >= 0; i-- ) {
            for ( int j = s2.length () - 1; j >= 0; j-- ) {
                if ( s1.charAt ( i ) == s2.charAt ( j ) ) {
                    dp[ i ][ j ] = dp[ i + 1 ][ j + 1 ] + 1;
                } else {
                    dp[ i ][ j ] = Integer.max ( dp[ i + 1 ][ j ], dp[ i ][ j + 1 ] );
                }

                if ( dp[ i ][ j ] > maxLength ) {
                    maxLength = dp[ i ][ j ];
                }
            }

        }

        return maxLength;
    }

    public static void main ( String args[] ) {

        int result = getMaxLength ( "ABC", "AC" );
        System.out.println ( "RESULT LENGTH=" + result );
    }
}
