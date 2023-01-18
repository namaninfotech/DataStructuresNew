package System.out;

import java.util.HashMap;

public class TwoSum {

    public static int[] find ( int nums[], int target ) {
        int arr[] = new int[ 2 ];

        HashMap<Integer, Integer> map = new HashMap<> ();

        for ( int i = 0; i < nums.length; i++ ) {
            if ( map.containsKey ( target - nums[ i ] ) ) {
                arr[ 0 ] = map.get ( target - nums[ i ] );
                arr[ 1 ] = i;

            } else {
                map.put ( nums[ i ], i );
            }

        }

        return arr;
    }

    public static void main ( String args[] ) {
        int arr[] = {2, 7, 11, 15};
        int ar[]=find ( arr, 9 );
        
        for(int y:ar)
        {
        System.out.println(y);
        }
    }
}
