
import java.util.ArrayList;
import java.util.List;

public class AllCombinationInString {

    public static void allSubStrings ( String s ) {
        List<String> list = new ArrayList<String> ();

        backtrack ( s, 0, "" );

    }

    public static void backtrack ( String s, int i, String current ) {
        System.out.println ( current );
        if ( current.length () == s.length () ) {
            return;
        }

        
        for ( int k = i; k < s.length (); k++ ) {
            backtrack ( s, k + 1, current + s.charAt ( k ) );
        }

    }

    public static void main ( String args[] ) {
        String s = "abcd";
        allSubStrings ( s );
    }
}
