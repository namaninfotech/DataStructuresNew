
public class ReverseANumber {

    int count = 0;

    public int result ( int x ) {
        int b = x;
        while ( b != 0 ) {
            int digit = b % 10;
            b = b / 10;

            if ( count > Integer.MAX_VALUE / 10 || count == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10 ) {
                return 0;
            }

            if ( count < Integer.MIN_VALUE / 10 || count == Integer.MIN_VALUE / 10 && digit < Integer.MIN_VALUE % 10 ) {
                return 0;
            }

            count = ( count * 10 ) + digit;

        }

        return count;
    }

    public static void main ( String args[] ) {
        int x = 1534236469;
        ReverseANumber rn = new ReverseANumber ();
        System.out.println ( rn.result ( x ) );
    }
}
