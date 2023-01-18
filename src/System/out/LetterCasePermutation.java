package System.out;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LetterCasePermutation {

    public static List<String> find ( String s ) {
        List<String> list = new ArrayList<> ();
        char c[] = s.toCharArray ();
        backtrack ( c, 0, list );
        return list;
    }

    public static void backtrack ( char[] c, int pos, List<String> list ) {

        if ( pos == c.length ) {
            String s = String.valueOf ( c );
            list.add ( s );
            
            return;
        }

        if ( c[ pos ] - '0' >= 0 && c[ pos ] - '0' <= 9 ) {

            backtrack ( c, pos + 1, list );
            return;
        } 

            c[ pos ] = Character.toLowerCase ( c[ pos ] );
            backtrack ( c, pos + 1, list );

            c[ pos ] = Character.toUpperCase ( c[ pos ] );
            backtrack ( c, pos + 1,list );
    }

    public static void main ( String args[] ) {

        String s = "0";
      System.out.println(  find ( s ));
    }
}
