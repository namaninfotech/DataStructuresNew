
import java.util.Collections;
import java.util.PriorityQueue;


public class LastStoneWeight {

    public static int find ( int array[] ) {
    
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        int size=array.length;
        for(int n:array)
        {
          pq.add ( n );
        }
        
        
        while(size>1)
        {
           int first=pq.poll ();
           int second=pq.poll ();
           size-=2;
           if(first-second > 0)
           {
             pq.add ( first-second);
             size+=1;
           }
        
        
        }
        
        if(!pq.isEmpty ())
            return pq.peek ();
        
        return 0;
    }
    
    

    public static void main ( String args[] ) {

        int array[]={2,7,4,1,8,1};
        System.out.println (find(array));
    }
}
