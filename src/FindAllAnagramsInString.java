
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author naman.khanna
 */
public class FindAllAnagramsInString {

    public List<Integer> findAnagrams ( String s, String p ) {
        List<Integer> list = new ArrayList<> ();

        HashMap<Character, Integer> map = new HashMap<> ();
        int k = p.length ();
        for ( int i = 0; i < k; i++ ) {
            map.put ( p.charAt ( i ), map.getOrDefault ( p.charAt ( i ), 0 ) + 1 );
        }

        HashMap<Character, Integer> compareMap = new HashMap<> ();
        for ( int i = 0; i <= s.length () - k; i++ ) {

            for ( int j = i; j < i + k; j++ ) {
                compareMap.put ( s.charAt ( j ), compareMap.getOrDefault ( s.charAt ( j ), 0 ) + 1 );
            }

            if ( compareMap.equals ( map ) ) {
                list.add ( i );
            }
            compareMap.clear ();
        }

        return list;
    }

    public static void main ( String args[] ) {

    }
}
