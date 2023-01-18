
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {

    public static List<List<String>> anagram ( String[] str ) {
        List<List<String>> listOfAnagram = new ArrayList<> ();
        HashMap<HashMap<Character, Integer>, List<String>> parentMap = new HashMap<> ();

        for ( String s : str ) {
            HashMap<Character, Integer> childMap = new HashMap<> ();
            for ( int i = 0; i < s.length (); i++ ) {
                childMap.put ( s.charAt ( i ), childMap.getOrDefault ( s.charAt ( i ) , 0 ) + 1 );
                
            }

            if ( parentMap.containsKey ( childMap ) ) {
                List<String> list = parentMap.get ( childMap );
                list.add ( s );
            }
            else{
                List<String > list=new ArrayList<>();
                list.add(s);
              parentMap.put ( childMap,list);
            }
        }

        parentMap.values ().forEach ( s -> {
            listOfAnagram.add ( s );
        } );

        return listOfAnagram;
    }

    public static void main ( String args[] ) {
        String str[] = {"ddddddddddg","dgggggggggg"};
        System.out.println ( anagram ( str ) );
    }
}
