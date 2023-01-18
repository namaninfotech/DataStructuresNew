package System.out;

import java.util.HashMap;

public class MajorityElement {

    public static int find ( int array[] ) {
        int count = 0;
        int f = 0;
        int n = array.length;

        HashMap<Integer, Integer> map = new HashMap<> ();

        for ( int i = 0; i < n; i++ ) {
            map.put ( array[ i ], map.getOrDefault ( array[ i ], 0 ) + 1 );

            if ( map.get ( array[ i ] ) >= n / 2 ) {
                if ( count < map.get ( array[ i ] ) ) {
                    count = map.get ( array[ i ] );
                    f = array[ i ];
                }

            }

        }

        return f;
    }

    public static void main ( String args[] ) {
        int array[] = {2, 2, 1, 1, 1, 2, 2,1,1,1,1,1};
        System.out.println ( find(array) );
    }

}
