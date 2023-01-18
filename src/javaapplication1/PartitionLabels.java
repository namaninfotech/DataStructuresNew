package javaapplication1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PartitionLabels {
    
    public static List<Integer> find ( String s ) {
        List<Integer> list = new ArrayList<> ();
        int previous = -1;
        int max = 0;
        
        HashMap<Character, Integer> map = new HashMap<> ();
        
        for ( int i = 0; i < s.length (); i++ ) {
            map.put ( s.charAt ( i ), i );
        }
        
        System.out.println ( map );
        
        for ( int i = 0; i < s.length (); i++ ) {
            if ( max < map.get ( s.charAt ( i ) ) ) {
                max = map.get ( s.charAt ( i ) );
            }
            
            if ( i == max ) {
                int result = max - previous;
                list.add ( result );
                previous = max;
            }
            
        }
        
        return list;
    }
    
    public static void main ( String args[] ) {
        
        String s = "ababcbacadefegdehijhklij";
        System.out.println ( find ( s ) );
    }
}
