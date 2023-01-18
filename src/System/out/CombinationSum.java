package System.out;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public static List<List<Integer>> find ( int array[],int target ) {
        List<List<Integer>> list = new ArrayList<> ();
        boolean[] check = new boolean[ array.length ];

        backtrack ( array, check, new ArrayList<> (),0,target );
        return list;
    }

    public static void backtrack ( int array[], boolean[] check, List<Integer> childList,int sum, int target ) {

          System.out.println (childList+"="+sum);
        if(childList.size()==array.length)
        {
           return;
        }
        
        for ( int i = 0; i < array.length; i++ ) {
            if ( !check[ i ] ) {
              sum=sum+array[i];
              check[i]=true;
              childList.add(array[i]);
              backtrack(array,check,childList,sum,target);
             int y=childList.remove ( childList.size()-1);
              sum=sum-y;
              check[i]=false;
            }

        }
    }

    public static void main ( String args[] ) {
        int array[] = {2, 3, 6, 7};
        int target = 7;
        
        find(array,target);
    }
}
