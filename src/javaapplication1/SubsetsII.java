package javaapplication1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII {

    public static List<List<Integer>> find ( int array[] ) {
        List<List<Integer>> list = new ArrayList<> ();
        backtrack ( list, new ArrayList<> (), array, 0 );
        return list;
    }

    private static void backtrack ( List<List<Integer>> list, List<Integer> arrayList, int[] array, int currentIndex ) {
       
        list.add(new ArrayList<>(arrayList));

        for ( int i = currentIndex ; i < array.length; i++ ) { 
            if(i!=currentIndex && array[i]==array[i-1])
                continue;
            arrayList.add ( array[i ] );
            backtrack ( list, arrayList, array, i+1 );
            arrayList.remove ( arrayList.size () - 1 );
        }
    }

    public static void main ( String args[] ) {
        int array[] = {1,2,3};
        System.out.println ( find ( array ) );
    }

}
