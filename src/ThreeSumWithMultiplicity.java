
public class ThreeSumWithMultiplicity {

    public static int find ( int arr[], int target ) {

        int result = 0;

        for ( int i = 0; i < arr.length-1; i++ ) {
            int count[] = new int[ 101 ];

            for ( int j = i + 1; j < arr.length; j++ ) {
                int k = target - arr[i] - arr[j];

                if ( k >= 0 && k <=100 && count[ k ] >= 0 ) {
                    result += count[ k ];
                    result %= 1000000007;
                }

                count[ arr[ j ] ]=count[arr[j]]+1;

            }

        }
        return result;
    }

    public static void main ( String args[] ) {

        int arr[] = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
        int target = 8;
        System.out.println ( find ( arr, target ) );
        
       
    }
}
