
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {

    public static int remove ( int[] nums ) {
        Set<Integer> set = new HashSet<> ();

        for ( int i = 0; i < nums.length; i++ ) {
            set.add ( nums[ i ] );

        }

        nums = set.stream ()
                .mapToInt ( Integer::intValue )
                .toArray ();

        return set.size ();

    }

    public static void main ( String args[] ) {
        int[] nums = {1, 1, 2};

        remove ( nums );
        for ( int i = 0; i < nums.length; i++ ) {
            System.out.print ( nums[ i ] );
        }
    }
}
