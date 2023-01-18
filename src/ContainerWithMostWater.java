
public class ContainerWithMostWater {

    public static int maximumWater ( int height[] ) {
        int maximum = 0;
        int size = height.length;
        int i = 0;
        int j = size - 1;

        while ( i < j ) {
            maximum = Math.max ( maximum, Math.min ( height[ i ], height[ j ] ) * ( j - i ) );

            if ( height[ i ] < height[ j ] ) {
                i++;
            } else {
                j--;
            }
        }

        return maximum;
    }

    public static void main ( String args[] ) {
        int height[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println ( maximumWater ( height ) );
    }
}
