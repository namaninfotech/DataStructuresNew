/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author naman.khanna
 */
public class LongestIncreasingSubsequence {

    public static void operation ( int arr[] ) {
        int temp[] = new int[ arr.length ];

        for ( int i = 0; i < temp.length; i++ ) {
            temp[ i ] = 1;

        }

        for ( int i = 0; i < arr.length - 1; i++ ) {
            for ( int j = i + 1; j < arr.length; j++ ) {
                if ( arr[ j ] > arr[ i ] && temp[ j ] <= temp[ i ] ) {
                    temp[ j ] = temp[ j ] + 1;
                }
            }
        }

        Arrays.sort ( temp );

        System.out.println ( temp[ arr.length - 1 ] );
    }

    public static void main ( String args[] ) {

        int arr[] = {5, 2, 8, 6, 3, 6, 9, 5};

        operation ( arr );
    }
}
