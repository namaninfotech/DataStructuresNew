
public class JumpGameII {

    public static int move ( int array[] ) {

        Integer dp[] = new Integer[ array.length  ];
        dp[ array.length-1 ] = 0;

        for ( int i = array.length - 2; i >= 0; i-- ) {
            
            if ( array[ i ] > 0 ) {
                int minimum = Integer.MAX_VALUE;

                for ( int j = 1; j <= array[i] && ( j + i ) < dp.length; j++ ) {
                    if ( dp[ i + j ] != null ) {
                        minimum = Math.min ( minimum, dp[ i + j ] );
                    }
                }
                if ( minimum != Integer.MAX_VALUE ) {
                    dp[ i ] = minimum + 1;

                }

            }
        }
        return dp[ 0 ];

    }

    public static void main ( String args[] ) {

        int array[] = {2,1};
        System.out.println ( move ( array ) );
    }
}
