
public class PowerOfTwo {

    public static boolean find ( int number ) {

        
        return recursion ( 1, number );
    }

    public static boolean recursion ( long count, int number ) {

        if(count>Integer.MAX_VALUE)
            return false;
        if ( count > number ) {
            return false;
        }
        if ( count == number ) {
            return true;
        }

        return recursion ( ( count << 1 ), number );
    }

    public static void main ( String args[] ) {
        int number = 1073741825;

        System.out.println ( find ( number ) );

    }
}
