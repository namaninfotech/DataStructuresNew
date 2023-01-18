package System.out;

import java.util.ArrayList;
import java.util.List;

public class CheckifNumbersAreAscendinginaSentence {

    public static boolean find ( String s ) {
        String p[] = s.split ( " " );
        int previous = Integer.MIN_VALUE;

        for ( int i = 0; i < p.length; i++ ) {
            String check = p[ i ];

            if ( check.charAt ( 0 ) - '0' <= 9 && check.charAt ( 0 ) - '0' >= 0 ) {
                int n = Integer.parseInt ( check );
                if ( previous > n ) {
                    return false;
                } else {
                    previous = n;
                }
            }
        }
        return true;
    }

    public static void main ( String args[] ) {
        String s = "1 box has 3 blue 4 red 6 green and 12 yellow 7 marbles";
        System.out.println(find ( s ));
    }
}
