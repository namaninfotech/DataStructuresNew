
public class CountPalindromicSubString {

    public static void main ( String args[] ) {
        String s = "ac";
        gettPalindromicCount ( s );

    }

    private static void gettPalindromicCount ( String s ) {
        int i, j;
        int count = 0;
        boolean dp[][] = new boolean[ s.length () ][ s.length () ];
        String temp = "";

        for ( int gap = 0; gap < s.length (); gap++ ) {
            for ( i = 0, j = gap; j < s.length (); i++, j++ ) {
                if ( gap == 0 ) {
                    dp[ i ][ j ] = true;
                } else if ( gap == 1 ) {
                    dp[ i ][ j ] = s.charAt ( i ) == s.charAt ( j );
                } else {

                    if ( s.charAt ( i ) == s.charAt ( j ) ) {
                        dp[ i ][ j ] = dp[ i + 1 ][ j - 1 ];
                    } else {
                        dp[ i ][ j ] = false;
                    }
                }
                if ( dp[ i ][ j ] ) {
                    if ( temp.length () <= ( j - i ) ) {
                        temp = s.substring ( i, j+1 );
                    }
                    count++;
                }

            }
        }
        System.out.println ( count + "||string=" + temp );
    }

}
