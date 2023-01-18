/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author naman.khanna
 */
public class KadanesAlgorithm {

    private static int findLargestContigousSum ( int arr[], int size ) {
        int max = 0;
        int currSum = 0;
        int finalSum = Integer.MIN_VALUE;

        for ( int index = 0; index < size; index++ ) {

            currSum+=arr[index];
            if ( currSum > finalSum ) {
                finalSum = currSum;
                max = finalSum;
            }

            if ( currSum < 0 ) {
                currSum = 0;
            }

        }

        return max;
    }

    public static void main ( String args[] ) {

        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int result = findLargestContigousSum ( arr, arr.length );
        System.out.println ( "RESULT=" + result );
    }
}
