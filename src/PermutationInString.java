
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author naman.khanna
 */
public class PermutationInString {

    public static boolean status ( String s1, String s2 ) {

        HashMap<Character, Integer> mapS1 = new HashMap<> ();
        int k = s1.length ();

        for ( int i = 0; i < s1.length (); i++ ) {
            char ch = s1.charAt ( i );
            mapS1.put ( ch, mapS1.getOrDefault ( ch, 0 ) + 1 );
        }

        HashMap<Character, Integer> mapS2 = new HashMap<> ();

        int j = 0;
        for ( int i = 0; i < s2.length (); i++ ) {
            char ch = s2.charAt ( i );
                
            if ( i - j == k  ) {
               
                if ( mapS1.equals ( mapS2 ) ) {
                    return true;
                } else {

                    if ( mapS2.get ( s2.charAt ( j ) ) == 1 ) {
                        mapS2.remove ( s2.charAt ( j ) );
                    } else {
                        mapS2.put ( s2.charAt ( j ), mapS2.get ( s2.charAt ( j ) ) - 1 );
                    }
                    j++;
                }

            }

            mapS2.put ( ch, mapS2.getOrDefault ( ch, 0 ) + 1 );
            System.out.println (mapS2);
        }
        
        if(mapS1.equals ( mapS2))
            return true;
        
        return false;

    }

    public static void main ( String args[] ) {
        String s1 = "adc";
        String s2 = "dcda";

        System.out.println ( status ( s1, s2 ) );
      
    }
}
