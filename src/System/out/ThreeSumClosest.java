package System.out;

import java.util.Arrays;
import java.util.Collections;

public class ThreeSumClosest {

    public int find ( int arr[], int target ) {

        Arrays.sort ( arr );

        long result = Integer.MAX_VALUE;

        for ( int i = 0; i < arr.length - 1; i++ ) {
            int ptr1 = i + 1;
            int ptr2 = arr.length - 1;

            while ( ptr1 < ptr2 ) {
                int currSum = arr[ i ] + arr[ ptr1 ] + arr[ ptr2 ];

                if ( Math.abs ( currSum - target ) < Math.abs ( result - target ) ) {
                   result=currSum;
                }
                if ( currSum > target ) {
                    ptr2--;
                } else {
                    ptr1++;
                }
            }

        }

        return (int) result;
    }

    public static void main ( String args[] ) {
        int arr[] = {-1, 2, 1, -4};
         int target=1;
         
         ThreeSumClosest tsm=new ThreeSumClosest();
         
         System.out.println (tsm.find(arr,target));
    }
}
