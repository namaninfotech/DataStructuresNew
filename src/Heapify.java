
import java.util.Collections;
import java.util.PriorityQueue;


public class Heapify {

    public static void maxHeap ( int arr[], int n, int index ) {

        int largest = index;

        int left = 2 * index+1;
        int right = ( 2 * index ) + 2;

        if ( left < n && arr[ left ] > arr[ largest ] ) {
            largest = left;
        }
        if ( right < n && arr[ right ] > arr[ largest ] ) {
            largest = right;
        }

        if ( largest != index ) {
            int temp = arr[ index ];
            arr[ index ] = arr[ largest ];
            arr[ largest ] = temp;

            maxHeap ( arr, n, largest );
        }

    }
    
    //MaxHeap using Priority Queue
    public static void priorityQueueHeapify(int arr[])
    {
      PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
    
      for(int i=0;i<arr.length;i++)
      {
        pq.add(arr[i]);
      }
      
      while(pq.size ()>0)
      {
        System.out.print(pq.poll ()+",");
      }
      System.out.println();
    }
    
    public static void find(int arr[])
    {
      int n=arr.length;
      
      for(int i=n-1;i>=0;i--)
      {
         maxHeap(arr,n,i);
      }
    }

    public static void main ( String args[] ) {

        int arr[] = {2,7,4,1,8,1};
       find(arr);
        priorityQueueHeapify ( arr );
       for(int i=0;i<arr.length;i++)
           System.out.print(arr[i]+",");
    }
}
