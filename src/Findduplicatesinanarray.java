
import java.util.ArrayList;
import java.util.Arrays;

public class Findduplicatesinanarray {

    public static ArrayList<Integer> find ( int array[] ) {

        int[] temp = new int[ array.length ];
        Arrays.fill ( temp, Integer.MIN_VALUE );
        ArrayList<Integer> list = new ArrayList<> ();

        for ( int i = 0; i < array.length; i++ ) {

            int currentElement = array[ i ] % ( array.length );
            if ( temp[ currentElement ] == -1 ) {
                if ( list.contains ( array[ i ] ) == false ) {
                    list.add ( array[ i ] );
                }
            } else {
                temp[ currentElement ] = -1;
            }
        }

        for ( int i = 0; i < temp.length; i++ ) {
            System.out.print ( temp[ i ] + "," );
        }

        System.out.println ();

        if ( list.size () == 0 ) {
            list.add ( -1 );
        }

        return list;
    }

    public static void main ( String args[] ) {

        int array[] = {0, 3, 1, 2};
        System.out.println ( find ( array ) );
    }
}
