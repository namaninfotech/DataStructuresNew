package System.out;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationDigit {

    public static List<List<Integer>> allPermutations ( int nums[] ) {
        List<List<Integer>> list = new ArrayList<> ();

        boolean[] freq = new boolean[ nums.length ];

        backtrack ( freq, list, new ArrayList<Integer> (), nums );

        return list;
    }

    public static void backtrack ( boolean[] freq, List<List<Integer>> list, List<Integer> store, int[] nums ) {
        if ( store.size () == nums.length ) {
            if(!list.contains ( store))
            list.add (new ArrayList(store)  );
            return;
        }

        for ( int i = 0; i < nums.length; i++ ) {
            if ( !freq[ i ] ) {
                freq[ i ] = true;
                store.add ( nums[ i ] );
                backtrack (freq,list,store,nums);
                store.remove ( store.size ()-1);
                freq[i]=false;
            }
        }

    }

    public static void main ( String args[] ) {
        int nums[] = {1, 1,2};
        
        System.out.println(allPermutations ( nums ));
    }
}
