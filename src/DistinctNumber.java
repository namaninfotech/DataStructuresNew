
import java.util.HashMap;

public class DistinctNumber {

    public boolean containsNearbyDuplicate ( int[] nums, int k ) {

        HashMap<Integer, Integer> map = new HashMap<> ();

        for ( int i = 0; i < nums.length; i++ ) {
            if ( map.containsKey ( nums[ i ] ) && ( Math.abs ( map.get ( nums[ i ] ) - i ) <= k ) ) {

                return true;
            } else {
                map.put ( nums[ i ], i );

            }
        }
        return false;
    }

    public static void main ( String args[] ) {
        int n[] = {1, 0, 1, 1};
        int k = 1;
        DistinctNumber dn = new DistinctNumber ();
        System.out.println ( dn.containsNearbyDuplicate ( n, k ) );
    }
}
