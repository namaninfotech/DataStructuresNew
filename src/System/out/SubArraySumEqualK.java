package System.out;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SubArraySumEqualK {

    public static int find ( int nums[], int k ) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<> ();

        int sum = 0;
        for ( int i = 0; i < nums.length; i++ ) {

            sum = sum + nums[ i ];

            if ( sum == k ) {
                count++;
            }
            if ( map.containsKey ( sum - k ) ) {
                count = count + map.get ( sum - k );
            }
            
            Integer c=map.get ( sum);
               if(c==null)
                   map.put(sum,1);
               else
                   map.put(sum,map.get ( sum)+1);
        
        }

        return count;

    }

    public static void main ( String args[] ) {
        int nums[] = {14,9,8,4,3,2};
        int k = 20;

        System.out.println ( find ( nums, k ) );
    }
}
