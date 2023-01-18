package System.out;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Values {

    int key;
    int value;

    Values ( int key, int value ) {
        this.key = key;
        this.value = value;
    }

}

public class TopKFrequentElements {

    public static int[] find ( int array[], int k ) {

        int n[] = new int[ k ];
        if ( array.length == 1 ) {
            n[ 0 ] = array[ 0 ];
            return n;
        }
        HashMap<Integer, Integer> map = new HashMap<> ();
        List<Values> list = new ArrayList<> ();

        for ( int i = 0; i < array.length; i++ ) {
            map.put ( array[ i ], map.getOrDefault ( array[ i ], 0 ) + 1 );
        }

 

        for ( Map.Entry<Integer, Integer> entry : map.entrySet () ) {
            list.add ( new Values ( entry.getKey (), entry.getValue () ) );
        }

        Comparator comparator = new Comparator<Values> () {
            @Override
            public int compare ( Values first, Values second ) {
                if ( first.value < second.value ) {
                    return 1;
                } else if ( first.value > second.value ) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };

        Collections.sort ( list, comparator );

        for ( int i = 0; i < k; i++ ) {
            System.out.println ( list.get ( i ).key );
            n[ i ] = list.get ( i ).key;
        }

        return n;
    }

    public static void main ( String args[] ) {
        int array[] = {1};
        find ( array, 2 );
    }
}
