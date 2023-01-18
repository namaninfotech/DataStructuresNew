package javaapplication1;

import java.util.HashMap;

public class SubArray {

    private static void operation ( int arr[], int k ) {
        int sum = 0;
        int result = 0;

        HashMap<Integer, Integer> map = new HashMap<> ();
        map.put ( 0, 1 );
        for ( int index = 0; index < arr.length; index++ ) {
            sum += arr[ index ];
            if ( map.containsKey ( sum - k ) ) {
                result = result + map.get ( sum - k );
            }

            map.put ( sum, map.getOrDefault ( sum, 0 ) + 1 );
        }
        System.out.println ( result );
    }

    public static void main ( String args[] ) {

        int arr[] = {1, 2, 3, 4, 5, 6};
        int k = 11;
        operation ( arr, k );
    }
}
