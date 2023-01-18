
import java.util.ArrayList;

public class PartitionEqualSubsetSumWithBacktracking {

    static boolean flag = false;

    public static boolean find ( int nums[] ) {
        int sum = 0;
        for ( int i = 0; i < nums.length; i++ ) {
            sum += nums[ i ];
        }

        if ( sum % 2 != 0 ) {
            return false;
        }

        return backtrack ( nums, 0, new ArrayList (), 0, sum / 2 );

    }

    public static boolean backtrack ( int array[], int index, ArrayList<Integer> list, int count, int target ) {

        if ( index > array.length || count > target ) {
            return false;
        }

        if ( count == target ) {
            flag = true;
            return true;

        }

        for ( int i = index; i < array.length; i++ ) {
            count = count + array[ i ];
            list.add ( array[ i ] );
            backtrack ( array, i + 1, list, count, target );
            count = count - list.remove ( list.size () - 1 );
        }
        return flag;
    }

    public static void main ( String args[] ) {
        int array[] = {1,1,1,2,5};
        System.out.println ( find ( array ) );
    }
}
