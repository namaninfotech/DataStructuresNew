
import java.util.HashMap;
import java.util.Map;

public class NextGreaterNumericallyBalancedNumber {

    public static int find ( int number ) {

        while ( true ) {
            if ( backtrack ( ++number ) ) {
                return number;
            }
        }

    }

    public static boolean backtrack ( int number ) {
        int[] freq = new int[ 10 ];

        int temp = number;
        while ( temp != 0 ) {
            int n = temp % 10;
            freq[ n ]++;
            temp = temp / 10;
        }

        for ( int i = 0; i < freq.length; i++ ) {
            if ( freq[ i ] != 0 && freq[ i ] != i ) {
                return false;

            }
        }

        return true;
    }

    public static void main ( String args[] ) {
        int number = 1;
        System.out.println ( find ( number ) );
    }

}
