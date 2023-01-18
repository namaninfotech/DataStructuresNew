
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneKeyPadCombination {

    public static List<String> letterCombinations ( String digits ) {
        List<String> list = new ArrayList<> ();
        
        if(digits.length()==0 || digits==null)
           return list;


        HashMap<String, String> map = new HashMap<> ();
        map.put ( "2", "abc" );
        map.put ( "3", "def" );
        map.put ( "4", "ghi" );
        map.put ( "5", "jkl" );
        map.put ( "6", "mno" );
        map.put ( "7", "pqrs" );
        map.put ( "8", "tuv" );
        map.put ( "9", "wxyz" );

        backtrack ( digits, 0, "", list, map );

        System.out.println ( list );
        return list;
    }

    public static void backtrack ( String digits, int index, String current, List<String> result, HashMap<String, String> map ) {
        if ( current.length () == digits.length () ) {
            result.add ( current );
            return;
        }

        String s = map.get ( String.valueOf ( digits.charAt ( index ) ) );

        for ( int i = 0; i < s.length (); i++ ) {
            backtrack ( digits, index + 1, current + s.charAt ( i ), result, map );
        }

    }

    public static void main ( String args[] ) {
      String digit="23";
        letterCombinations ( digit );
    }
}
