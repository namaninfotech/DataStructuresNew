
import java.util.HashMap;

public class NonRepeatingElement {

    public static int find ( int arr[] ) {
        int output = 0;
        HashMap<Integer, Integer> map = new HashMap<> ();

        for ( int i = 0; i < arr.length; i++ ) {
            map.put ( arr[ i ], map.getOrDefault ( arr[ i ], 0 ) + 1 );
        }

        for ( int i = 0; i < arr.length; i++ ) {
            if ( map.get ( arr[ i ] ) == 1 ) {
                output = arr[ i ];
                break;
            }

        }

        return output;
    }

    public static void main ( String args[] ) {
        int arr[] = {-1, 2, -1, 3, 2};
        System.out.println(find(arr));
    }
}
