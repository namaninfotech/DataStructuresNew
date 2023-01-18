
public class QuickSort {

    public static void element ( int array[] ) {

        int start = 0;
        int end = array.length - 1;
        
        algorithm ( start, end, array );

    }

    public static void algorithm ( int start, int end, int array[] ) {

        if ( start < end ) {
            int pivot = partition ( array, start, end );
            algorithm ( start,pivot - 1, array );
            algorithm (  pivot + 1,end, array );

        }
    }

    public static int partition ( int array[], int start, int end ) {

        int middle = ( start + end ) / 2;
        int pivot = array[ start ];

        int i = start;
        int j = end;

        while ( i < j ) {
            while (i<j && array[ i ] <= pivot ) {
                i++;
            }
            while ( array[ j ] > pivot ) {
                j--;
            }

            if ( i < j ) {
                swap ( array, i, j );
            }
        }
        swap ( array, start, j );

        return j;
    }

    public static void swap ( int array[], int i, int j ) {
        int temp = array[ i ];
        array[ i ] = array[ j ];
        array[ j ] = temp;

    }

    public static void main ( String args[] ) {

        int array[]={2,0,1};
        element(array);
        
        for(int i=0;i<array.length;i++)
            System.out.print(array[i]+",");
    }
}
