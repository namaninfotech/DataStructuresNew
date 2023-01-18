package System.out;

public class LongestCommonPrefix {

    public static String find ( String[] strs ) {
        String res = strs[ 0 ];

        for ( int i = 1; i < strs.length; i++ ) {

            String temp = strs[ i ];

            if ( res.length () > temp.length () ) {
                res = res.substring ( 0, temp.length () );
            }

            for ( int j = 0; j < Integer.min ( res.length (), temp.length () ); j++ ) {
                if ( !( res.charAt ( j ) == temp.charAt ( j ) ) ) {
                    res = res.substring ( 0, j );
                    System.out.println ( res );
                    break;
                }
            }
        }
        return res;
    }

    public static void main ( String args[] ) {
        String[] strs = {"ab", "a"};
        System.out.println ( find ( strs ) );
    }
}
