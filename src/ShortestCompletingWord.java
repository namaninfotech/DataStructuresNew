
import java.util.HashMap;

public class ShortestCompletingWord {

    public static String find ( String plate, String word[] ) {

        String result = "";

        HashMap<Character, Integer> map = new HashMap<> ();
        plate = plate.toLowerCase ();
        for ( int i = 0; i < plate.length (); i++ ) {
            char c = plate.charAt ( i );
            if ( Character.isAlphabetic ( c ) ) {
                map.put ( plate.charAt ( i ), map.getOrDefault ( c, 0 ) + 1 );
            }
        }

        for ( String check : word ) {
            check = check.toLowerCase ();
            HashMap<Character, Integer> temp = new HashMap ( map );

            for ( int i = 0; i < check.length (); i++ ) {
                if ( temp.containsKey ( check.charAt ( i ) ) ) {
                    int val = temp.get ( check.charAt ( i ) );
                    if ( val == 1 ) {
                        temp.remove ( check.charAt ( i ) );
                    } else {
                        temp.put ( check.charAt ( i ), val - 1 );
                    }

                }
            }

            if ( temp.isEmpty () ) {
                if ( result.isEmpty () ) {
                    result = check;
                } else if ( result.length () > check.length () ) {
                    result = check;
                }
            }

        }
        return result;
    }

    public static void main ( String args[] ) {
        String plate = "1s3 PSt";
        String[] words = {"step", "steps", "stripe", "stepple"};
        System.out.println ( find ( plate, words ) );
    }
}
