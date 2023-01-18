/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.HashMap;

/**
 *
 * @author naman.khanna
 */
public class LargestSubArrayWithSumZero {

    private static int find ( int array[], int size ) {
        int max = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<> ();

        for ( int i = 0; i < size; i++ ) {
            sum = sum + array[ i ];

            if ( sum == 0 ) {
                max = i + 1;
            }

            if ( map.containsKey ( sum ) ) {
                max = Math.max ( i - map.get ( sum ), max );

            } else {
                map.put ( sum, i );
            }

        }

        return max;
    }

    public static void main ( String args[] ) {
        
        int A[] = {1,-1,1,-1};
        int N = A.length;
        int result = find ( A, N );
        System.out.println ( result );
    }
}
