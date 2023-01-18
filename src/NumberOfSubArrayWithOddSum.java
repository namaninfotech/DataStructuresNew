
public class NumberOfSubArrayWithOddSum {
static long count = 0;
    public static int find ( int[] n ) {
        

        for ( int i = 0; i < n.length; i++ ) {
            all ( n, i, i, 0 );
        }
        
        return (int)count%1000000007;
    }

    public static void all ( int[] n, int index, int number, int sum ) {
        if ( index == n.length ) {
            return;
        }

        sum = sum + n[ index ];
        if ( sum % 2 != 0 ) {
            count = count + 1;
        }

        all ( n,  index + 1, number, sum );

    }

    public static void main ( String args[] ) {
        int n[] = {1,3,5};
        System.out.println (find ( n ));
    }
}
