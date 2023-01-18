
import java.util.HashSet;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author naman.khanna
 */
public class Reversewordsinagivenstring {

    public static String reverse ( String s ) {

        s = s.trim ();
        int j = s.length ();
        String p = "";

        for ( int i = s.length () - 1; i >= 0; i-- ) {

            if ( s.charAt ( i ) == '.' ) {
                p = p + s.substring ( i + 1, j ) + ".";
                j = i;
            }

        }

        p = p + s.substring ( 0, j );
        return p;
    }

    public static void main ( String args[] ) {
        String s = "i.like.this.program.very.much";
        System.out.println ( reverse ( s ) );
        
        Set<Integer> set=new HashSet<>();
        
    }
}
