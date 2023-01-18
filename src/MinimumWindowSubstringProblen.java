
import java.util.HashMap;

public class MinimumWindowSubstringProblen {

    public static int find ( String s ) {

        String ans = "";

        HashMap<Character, Integer> unique = new HashMap ();
        unique.put ( 'a', 1 );

        HashMap<Character, Integer> container = new HashMap ();
        int currentCount = 0;
        int validCount = 3;
        int i = -1;
        int j = -1;
        while ( true ) {

            boolean flag1 = false;
            boolean flag2 = false;
            // add into the container
            while ( i < s.length () - 1 && currentCount < validCount ) {
                flag1 = true;
                i++;
                char c = s.charAt ( i );
                container.put ( c, container.getOrDefault ( c, 0 ) + 1 );

                if ( container.getOrDefault ( c, 0 ) <= unique.getOrDefault ( c, 0 ) ) {
                    currentCount++;
                }

            }

            // collect answer and release
            while ( j < i && validCount == currentCount ) {

                String pans = s.substring ( j + 1, i + 1 );

                if ( ans.length () == 0 || pans.length () < ans.length () ) {
                    ans = pans;
                }

                j++;
                char ch = s.charAt ( j );

                if ( container.get ( ch ) == 1 ) {
                    container.remove ( ch );
                } else {
                    container.put ( ch, container.get ( ch ) - 1 );
                }

                if ( container.getOrDefault ( ch, 0 ) < unique.getOrDefault ( ch, 0 ) ) {
                    currentCount--;
                }

                flag2 = true;
            }

            if ( !flag1 && !flag2 ) {
                break;
            }
        }

        return ans.length ();
    }

    public static void main ( String args[] ) {
        String s = "ab";
        System.out.println ( find ( s ) );

    }
}
