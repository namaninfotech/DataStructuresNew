package System.out;


/*

  cases 
1) zero and non-zero
2) non-zero and non zero
3) non zero and zero
4) zero zero

 */
public class DecodeWays {

    public static int decode ( String s ) {
       
        int dp[] = new int[ s.length () ];
        int index;
        for ( index = 0; index < s.length (); index++ ) {
            if ( s.charAt ( index ) - '0' == 0 ) {
                return 0;
            }
            else
                break;
        }
        
        

        if ( index < s.length () ) {

            dp[ index ] = 1;
            for ( int i = index + 1; i < s.length (); i++ ) {

                if ( s.charAt ( i ) == '0' && s.charAt ( i - 1 ) == '0' ) // both are zero
                {
                    dp[ i ] = 0;
                } else if ( s.charAt ( i ) == '0' && s.charAt ( i - 1 ) != '0' ) // i=0 and i-1!=0
                {
                    String h = s.substring ( i - 1, i + 1 );
                    if ( Integer.parseInt ( h ) <= 26 ) {
                        dp[ i ] = i >= 2 ? dp[ i - 2 ] : 1;
                    }
                } else if ( s.charAt ( i ) != '0' && s.charAt ( i - 1 ) == '0' )// i!=0 && i-1==0
                {
                    dp[ i ] = dp[ i - 1 ];
                } else //both are non zero
                {
                    if ( Integer.parseInt ( s.substring ( i - 1, i + 1 ) ) <= 26 ) {
                        dp[ i ] = dp[ i - 1 ] + ( i >= 2 ? dp[ i - 2 ] : 1 );
                    } else {
                        dp[ i ] = dp[ i - 1 ];
                    }
                }
            }
        }
        
        for(int i=0;i<dp.length;i++)
        {
         System.out.print ( dp[i]+",");
        }
        System.out.println();
        return  dp[ s.length () - 1 ];
    }

    public static void main ( String args[] ) {
        String s = "226";
       System.out.println(decode(s));
    }
}
