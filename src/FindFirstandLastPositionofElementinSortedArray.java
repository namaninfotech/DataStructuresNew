
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindFirstandLastPositionofElementinSortedArray {

    public static int[] searchRange ( int[] array, int target ) {
        int a[] = {-1, -1};

        a[ 0 ] = findStartingIndex ( array, target );
        a[ 1 ] = findEndingIndex ( array, target );
        return a;
    }

    public static int findStartingIndex ( int[] array, int target ) {
        int index = -1;

        int start = 0;
        int end = array.length - 1;

        while ( start <= end ) {
            int mid = start + ( end - start ) / 2;

            if ( array[ mid ] >= target ) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

            if ( array[ mid ] == target ) {
                index = mid;
            }
        }
        return index;
    }

    public static int findEndingIndex ( int[] array, int target ) {
        int index = -1;

        int start = 0;
        int end = array.length - 1;

        while ( start <= end ) {
            int mid = start + ( end - start ) / 2;

            if ( array[ mid ] <= target ) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }

            if ( array[ mid ] == target ) {
                index = mid;
            }
        }
        return index;
    }

    public static void main ( String args[] ) {
        int array[] = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int a[] = searchRange ( array, target );

        System.out.println ( a[ 0 ] + "" + a[ 1 ] );

        List<Integer> list = new ArrayList<> ();
        list.add ( 1 );
        list.add ( 33 );
        list.add ( 144 );
        Collections.sort (list);
        System.out.println ( list );
    }
}
