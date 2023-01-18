
import java.util.ArrayList;
import java.util.List;

public class WordBreak {

    public static boolean find ( String s, List<String> list ) {

        int[] dp = new int[ s.length ()  ];

        

        for ( int i = 0; i < s.length (); i++ ) {
            for ( int j = 0; j <= i; j++ ) {
                if ( list.contains ( s.substring ( j, i + 1 ) ) ) {
                    if ( j > 0 ) {
                        dp[ i ] += dp[ j - 1 ];
                    } else {
                        dp[ i ] = 1;
                    }
                }
            }
        }
        return dp[ s.length () - 1 ] > 0;

    }

    public static void main ( String args[] ) {
        List<String> list = new ArrayList<> ();

        list.add ( "apple" );
        list.add ( "pen" );
        String s = "applepenapple";
        System.out.println ( find ( s, list ) );

    }
}
