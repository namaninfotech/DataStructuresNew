package BitManipulation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class NumberofValidWordsforEachPuzzle {

    public static List<Integer> find ( String[] words, String[] puzzles ) {
        List<Integer> list = new ArrayList<> ();

        HashMap<Character, ArrayList<Integer>> map = new HashMap<> ();

        for ( int i = 0; i < 26; i++ ) {
            map.put ( (char) ( 'a' + i ), new ArrayList<> () );

        }

        for ( String word : words ) {
            int mask = 0;
            //below loop is for make the mask
            for ( char ch : word.toCharArray () ) {
                int bit = ch - 'a';

                mask = mask | ( 1 << bit );
            }
           

            //below loop to put word in map
            HashSet<Character> set=new HashSet<>();
            for ( char ch : word.toCharArray () ) {
                if(set.contains ( ch ))
                    continue;
                
                map.get ( ch ).add ( mask );
                set.add ( ch );
            }

        }
        
        

        for ( String puzzle : puzzles ) {
            int puzzleMask = 0;
            for ( char ch : puzzle.toCharArray () ) {
                int bit = ch - 'a';
                puzzleMask = puzzleMask | ( 1 << bit );

            }

            char firstCharacter = puzzle.charAt ( 0 );

            ArrayList<Integer> tempList = map.get ( firstCharacter );
            int count=0;
            for ( int mask : tempList ) {
                System.out.println(Integer.toBinaryString ( mask ));
                if((mask&puzzleMask)== mask)
                {
                  System.out.println ("HERE");
                  count++;
                }
            }
            list.add(count);

        }
        return list;
    }

    public static void main ( String args[] ) {

        String puzzles[]={"aboveyz","abrodyz","abslute","absoryz","actresz","gaswxyz"};
        String words[]={"aaaa","asas","able","ability","actt","actor","access"};
        
        System.out.println(find(words,puzzles));
    }
}
