
import java.util.Arrays;
import java.util.HashMap;

public class RankTransformofanArray {

    public static int[] find ( int array[] ) {
        int a[] = new int[ array.length ];

        
        int b[]=array.clone ();
        
        Arrays.sort ( b);
        HashMap<Integer, Integer> map = new HashMap<> ();
        int count=1;
        for ( int i = 0; i < array.length; i++ ) {

            if ( !map.containsKey ( b[ i ] ) ) {
                map.put ( b[ i ], count++ );
            }
        }
       
        System.out.println (map);
        for ( int i = 0; i < array.length; i++ ) {
                       
            a[i]=map.get ( array[i]);
          System.out.println (map.get ( array[i])+"\t"+array[i]);  
        }

        return a;

    }

    public static void main ( String args[] ) {

        int array[] = {100,100,100};
       int a[]=find(array);
       
       for(int i=0;i<a.length;i++)
           System.out.print(a[i]+",");
    }
}
