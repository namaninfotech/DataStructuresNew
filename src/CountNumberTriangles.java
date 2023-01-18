
import java.util.Arrays;

public class CountNumberTriangles {

    public static int count ( int arr[] ) {
        Arrays.sort ( arr );
        int count = 0;
        int n = arr.length;

        for ( int k = n - 1; k >= 2; k-- ) {
            int j = k - 1;
            int i = 0;

            while ( i < j ) {
                int sumOfTwoSide = arr[ i ] + arr[ j ];

                if ( sumOfTwoSide > arr[ k ] ) {
                    count += ( j - i );
                    j--;
                } else {
                    i++;
                }

            }
        }

        return count;
    }

    public static void main ( String args[] ) {
        int arr[] = {6, 4, 9, 7, 8};
        System.out.println ( count ( arr ) );

    }
}
