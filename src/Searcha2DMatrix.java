
public class Searcha2DMatrix {

    public static boolean search ( int array[][], int target ) {

        int start = Integer.MIN_VALUE;
        for ( int i = 0; i < array.length; i++ ) {
            if ( target >= array[ i ][ 0 ] && target <= array[ i ][ array[ i ].length-1] ) {
                start = i;
                break;
            }
        }

        if ( start == Integer.MIN_VALUE ) {
            return false;
        }

        for ( int j = 0; j < array[ start ].length; j++ ) {
            if ( array[ start ][ j ] == target ) {
                return true;
            }
        }

        return false;
    }

    public static void main ( String args[] ) {
        int array[][] = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
         System.out.println(search(array,3));
    }
}
