package System.out;

public class MinCostClimbingStairs {

    public static int minimumCost ( int array[] ) {
        int dp[] = new int[ array.length + 1 ];

        dp[ array.length ] = 0;
        dp[ array.length - 1 ] = array[ array.length - 1 ];

        for ( int i = array.length - 2; i >= 0; i-- ) {

            dp[ i ] = Math.min ( array[ i ] + dp[ i + 1 ], array[ i ] + dp[ i + 2 ] );

        }

        return Math.min ( dp[ 0 ], dp[ 1 ] );

    }

    public static void main ( String args[] ) {
        int array[] = {1,100,1,1,1,100,1,1,100,1};
      System.out.println(minimumCost ( array ));
    }
}
