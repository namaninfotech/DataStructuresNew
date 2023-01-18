package System.out;

import java.util.ArrayList;
import java.util.List;

public class Atoi {

    public static int find ( String s ) {
        double result = 0;
        String res="";
        int i = 0;
        int sign = 1;
        List<Integer> list = new ArrayList<> ();
        list.add ( 0 );
        list.add ( 1 );
        list.add ( 2 );
        list.add ( 3 );
        list.add ( 4 );
        list.add ( 5 );
        list.add ( 6 );
        list.add ( 7 );
        list.add ( 8 );
        list.add ( 9 );

        // checking of whilte space
        while ( i < s.length () && s.charAt ( i ) == ' ' ) {
            i++;
        }

        // checking of sign
        if ( i < s.length () && s.charAt ( i ) == '-' ) {
            sign = -1;
            i++;
        } else if ( i < s.length () && s.charAt ( i ) == '+' ) {
            i++;
        }

        //checking for number
        while ( i < s.length () && list.contains ( s.charAt ( i ) - '0' ) ) {
           
            result = result * 10 + ( s.charAt ( i ) - '0' );
            res+=s.charAt(i); 
            i++;
        }

        
        
        result = result * sign;
        
        

        if ( result < 0 && result < Integer.MIN_VALUE ) {
            System.out.println ( "returning min value" );
            return Integer.MIN_VALUE;
        }
        if ( result > 0 && result > Integer.MAX_VALUE ) {
            System.out.println ( "returning max value" );
            return Integer.MAX_VALUE;
        }

        return (int) result;

    }

    public static void main ( String args[] ) {
        String s = "1111111111111111111111111111111111122222244444 dscdcsdcczcxzxccsacasdasdd";

        System.out.println ( find ( s ) );
    }
}
