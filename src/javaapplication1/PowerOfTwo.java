/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author naman.khanna
 */
public class PowerOfTwo {

    public static void main ( String args[] ) {

        int x = 0;
        int n;

        while ( x < 8 ) {
            n = 1 << x;
            System.out.println ( n );
            x++;

        }
    }
}
