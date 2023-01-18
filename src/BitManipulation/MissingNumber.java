/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BitManipulation;

/**
 *
 * @author naman.khanna
 */
public class MissingNumber {

    public static void main ( String args[] ) {
        int n[] = {3, 0, 1,2};

        int x1 = n[ 0 ];
        for ( int i = 1; i < n.length; i++ ) {
            x1 = x1 ^ n[ i ];
        }
        int x2 = 1;
        for ( int i = 2; i <= n.length ; i++ ) {
            x2 = x2 ^ i;
        }
        
        System.out.println (x2^x1);
    }
}
