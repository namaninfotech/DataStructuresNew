
public class FindPeakElement {

    public static int find ( int array[] ) {
        int index = 0;

        int start = 0;
        int end = array.length - 1;

        while ( start <= end ) {
            int mid = start + ( end - start ) / 2;

            if ( ( mid == 0 || array[mid + 1] <= array[mid] ) && (mid == array.length - 1 || array[ mid ] >= array[ mid + 1 ]) ) {
                return mid;

            }else if(mid>0 && array[mid-1]>array[mid])
               end=mid-1;
            else if(mid<array.length && array[mid+1]>array[mid])
                start=mid+1;
                
        }
        return index;
    }

    public static void main ( String args[] ) {
        int array[] = {1, 2};
         System.out.println(find(array));
    }
}
