package System.out;

public class PermutationString {

    public static void permutate ( String s ) {

        int n = s.length ();
        boolean[] array = new boolean[ s.length () ];
        backtrack ( s,new StringBuilder(""), array );
    }

    public static void backtrack ( String s, StringBuilder temp, boolean[] array ) {
        if ( temp.length () == s.length () ) {
            System.out.println (temp);
            return;
        }

        for ( int i = 0; i < s.length (); i++ ) {
            if ( !array[ i ] ) {
                temp = temp.append ( s.charAt ( i ) ) ;
                array[ i ] = true;
                backtrack ( s, temp, array );
                temp.deleteCharAt (temp.length ()-1);
                array[i]=false;            
            }
        }
    }

    public static void main ( String args[] ) {
        String s = "abcd";
        permutate ( s );
    }
}
