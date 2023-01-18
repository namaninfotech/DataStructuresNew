package javaapplication1;

public class MergeSort {

    public static void sortArray ( int array[] ) {
        int p[] = merge ( array, 0, array.length - 1 );

        for ( int i = 0; i < p.length; i++ ) {
            System.out.print ( p[ i ] + "," );
        }
        
    }

    public static int[] merge ( int array[], int low, int high ) {
        if ( low == high ) {
            int temp[] = new int[ 1 ];
            temp[ 0 ] = array[ low ];
            return temp;
        }
        int mid = low + ( high - low ) / 2;
        int left[] = merge ( array, low, mid );

        int right[] = merge ( array, mid + 1, high );

        int mergeArray[] = mergeTwoSortedArray ( left, right );
        return mergeArray;

    }

    public static int[] mergeTwoSortedArray ( int a[], int b[] ) {

        int i = 0;
        int j = 0;
        int k = 0;
        int temp[] = new int[ a.length + b.length ];

        while ( i < a.length && j < b.length ) {

            if ( a[ i ] <= b[ j ] ) {
                temp[ k ] = a[ i ];

                i++;
                k++;
            } else {
                temp[ k ] = b[ j ];
                j++;
                k++;
            }
        }

        while ( i < a.length ) {
            temp[ k ] = a[ i ];
            i++;
            k++;
        }

        while ( j < b.length ) {
            temp[ k ] = b[ j ];
            j++;
            k++;
        }

        return temp;
    }

    public static void main ( String arsg[] ) {
        int array[] = {2, 4, 1, 55, 6, 8, 111, 23, 4, 5, 10000, 111};

        sortArray ( array );
     
    }
}
