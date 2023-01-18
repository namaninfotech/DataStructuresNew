
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ValidAnagram {

    public static boolean check ( String s, String t ) {
        List<HashMap<Character, Integer>> list = new ArrayList<> ();

        HashMap<Character, Integer> map = new HashMap<> ();
        for ( int i = 0; i < s.length (); i++ ) {
            map.put ( s.charAt ( i ), map.getOrDefault ( s.charAt ( i ), 0 ) + 1 );
        }
        list.add ( map );

        HashMap<Character, Integer> map2 = new HashMap<> ();
        for ( int i = 0; i < t.length (); i++ ) {
            map2.put ( t.charAt ( i ), map2.getOrDefault ( t.charAt ( i ), 0 ) + 1 );
        }

        if ( !list.contains ( map2 ) ) {
            return false;
        }
        return true;
    }

    public static void main ( String args[] ) {
        String s = "aa";
        String t = "bb";

        System.out.println ( check ( s, t ) );

    }
}
