package System.out;

import java.util.HashMap;

public class RomanToInteger {

    public static int find ( String s ) {
        int result = 0;
        int n = s.length();

        HashMap<Character, Integer> map = new HashMap<> ();

        boolean[] checking=new boolean[s.length()];
        map.put ( 'I', 1 );
        map.put ( 'V', 5 );
        map.put ( 'X', 10 );
        map.put ( 'L', 50 );
        map.put ( 'C', 100 );
        map.put ( 'D', 500 );
        map.put ( 'M', 1000 );
        

        for ( int i = 0; i < s.length () ; i++ ) {
            if(i !=n-1 && (map.get ( s.charAt(i))<map.get (s.charAt(i+1)) ))
            {
              result+=map.get ( s.charAt(i+1))-map.get ( s.charAt(i) );
            i++;
            }
            else{
                result+=map.get ( s.charAt(i));
            
            }
        }

//    for(int i=0,j=i+1;j<s.length();i++,j++)
//    {
//        
//    }
//    
        return  result ;
    }

    public static void main ( String arsg[] ) {
        String s = "MCMXCIV";
        System.out.println ( find ( s ) );

    }
}
