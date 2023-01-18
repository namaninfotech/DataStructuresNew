package BitManipulation;


public class RightMostSetBit {

   
    
  

    public static void main ( String args[] ) {
        int x = 12;

        int oneComplement = ~( x );
        int twoComplement = oneComplement + 1;

        System.out.println ( twoComplement );
        
        int rmsb=(x&twoComplement);
        System.out.println ( rmsb );
        
        int position=(int) (Math.log10 ( x & -x)/ (Math.log10 ( 2)))+1;
        System.out.println (position);
    }

}
