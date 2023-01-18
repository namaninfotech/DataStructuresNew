package javaapplication1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

class Pair {

    int start;
    int end;

    Pair ( int start, int end ) {
        this.start = start;
        this.end = end;
    }
}

public class MergeIntervals {

    public static int[][] find ( int[][] intervals ) {

        List<Pair> list = new ArrayList<> ();
        Stack<Pair> stack = new Stack ();

        for ( int i = 0; i < intervals.length; i++ ) {

            list.add ( new Pair ( intervals[ i ][ 0 ], intervals[ i ][ 1 ] ) );

        }

        Comparator com = (Comparator<Pair>) ( Pair o1, Pair o2 ) -> {
            if ( o1.start > o2.start ) {
                return 1;
            } else if(o1.start < o2.start){
                return -1;
                
            }
            else
                return 0;
        };
        Collections.sort ( list, com );

        stack.add ( list.get ( 0 ) );
        
       
        for ( int i = 1; i < intervals.length; i++ ) {
            Pair inStackElement = stack.peek ();
            Pair inListElement = list.get ( i );
             
            if ( inStackElement.end >= inListElement.start ) {
                stack.pop ();
                stack.push ( new Pair ( inStackElement.start, Math.max ( inListElement.end, inStackElement.end ) ) );
            } else {
                stack.push ( new Pair ( inListElement.start, inListElement.end ) );
            }

            Pair pair1 = stack.peek ();

//            System.out.println ( pair1.start + "," + pair1.end );
        }

        int[][] value = new int[ stack.size () ][ 2 ];

        for ( int i = value.length - 1; i >= 0; i-- ) {

            Pair pair = stack.pop ();
            value[ i ][ 0 ] = pair.start;
            value[ i ][ 1 ] = pair.end;

        }

        return value;

    }

    public static void main ( String args[] ) {
        int[][] intervals = {{1, 4}, {1, 5}};
        int[][] value = find ( intervals );

        for ( int i = 0; i < value.length; i++ ) {
            System.out.println ( value[ i ][ 0 ] + "," + value[ i ][ 1 ] );
        }
    }
}
