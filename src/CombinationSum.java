
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CombinationSum {

    public static List<List<Integer>> sum ( int[] candidates, int target ) {
        List<List<Integer>> list = new ArrayList<> ();
        backtrack ( candidates, list, 0, target, new ArrayList<> () );
        return list;
    }

    public static void backtrack ( int[] candidates, List<List<Integer>> list, int currentNumber, int target, List<Integer> childList ) {

        if ( currentNumber > target ) {
            return;
        }

        if ( currentNumber == target ) {
           
            List<Integer> temp = new ArrayList ( childList );
            Collections.sort ( temp );
            if(!list.contains ( temp ))
            list.add ( new ArrayList ( temp ) );
        }

        for ( int i = 0; i < candidates.length; i++ ) {
            childList.add ( candidates[ i ] );
            currentNumber = currentNumber + candidates[ i ];
            backtrack ( candidates, list, currentNumber, target, childList );
            currentNumber -= childList.remove ( childList.size () - 1 );
        }
    }

    public static void main ( String args[] ) {
        int candidates[] = {2, 3, 6, 7};
        int target = 7;
        System.out.println ( sum ( candidates, target ) );
    }
}
