
import java.util.ArrayList;
import java.util.List;

public class NumberCombinations {

    public static List<List<Integer>> combinations ( int k, int n ) {
        List<List<Integer>> list = new ArrayList<> ();

        backtrack ( k, list, new ArrayList<> (), 1, n );

        return list;
    }

    public static void backtrack ( int k, List<List<Integer>> list, List<Integer> childList, int index, int n ) {

        if ( childList.size () == k ) {
            list.add ( new ArrayList ( childList ) );

            return;
        }

        for ( int start = index; start <= n; start++ ) {
            childList.add ( start );
            backtrack ( k, list, childList, start + 1, n );
            childList.remove ( childList.size () - 1 );
        }

    }

    public static void main ( String args[] ) {

        combinations ( 2, 4 );
    }
}
