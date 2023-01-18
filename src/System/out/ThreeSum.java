package System.out;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public List<List<Integer>> find ( int nums[] ) {

        Arrays.sort ( nums );
        List<List<Integer>> parentList = new ArrayList<> ();
        List<Integer> childList;

        for ( int start = 0; start < nums.length - 2; start++ ) {

            if ( start != 0 ) {
                if ( nums[ start ] == nums[ start - 1 ] ) {
                    continue;
                }
            }

            int between = start + 1;
            int end = nums.length - 1;

            while ( between < end ) {
                int sum = nums[ start ] + nums[ between ] + nums[ end ];

                if ( sum == 0 ) {
                    childList = new ArrayList<> ();
                    childList.add ( nums[ start ] );
                    childList.add ( nums[ between ] );
                    childList.add ( nums[ end ] );
                    //if ( !parentList.contains ( childList ) ) {
                    parentList.add ( childList );
                    //}
                }
                if ( sum > 0 ) {
                    end--;
                } else {
                    between++;
                }
            }

        }

        return parentList;
    }

    public static void main ( String args[] ) {
        ThreeSum ts = new ThreeSum ();
        int[] nums = {0, 0, 0, 0};
        System.out.println ( ts.find ( nums ) );
    }
}
