/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Stack;

public class LeftRightSmallerElement {

    private static void findSmallestElemnt ( int arr[], int size ) {

        checkLefttSide ( arr, size );
        checkRightSide ( arr, size );
    }

    private static void checkLefttSide ( int arr[], int size ) {
        Stack<Integer> stack = new Stack<> ();

        int temp[] = new int[ size ];
        for ( int i = 0; i < size; i++ ) {
            if ( stack.isEmpty () ) {
                temp[ i ] = -1;
            } else {
                int val = stack.peek ();
                if ( val < arr[ i ] ) {
                    temp[ i ] = val;
                } else {
                    while ( !stack.isEmpty () && stack.peek () >= arr[ i ] ) {
                        stack.pop ();

                        if ( stack.isEmpty () ) {
                            temp[ i ] = -1;
                        } else {
                            temp[ i ] = stack.peek ();
                        }
                    }
                }

            }
            stack.push ( arr[ i ] );

        }

        printArray ( temp, size, "left side element check" );
    }

    private static void printArray ( int arr[], int size, String side ) {
        System.out.println ( side.toUpperCase () );
        for ( int i = 0; i < size; i++ ) {
            System.out.print ( arr[ i ] + "\t" );
        }
        System.out.println();

    }

    private static void checkRightSide ( int arr[], int size ) {
        Stack<Integer> stack = new Stack<> ();

        int temp[] = new int[ size ];
        for ( int i = size - 1; i >= 0; i-- ) {
            if ( stack.isEmpty () ) {
                temp[ i ] = -1;
            } else {
                int val = stack.peek ();
                if ( val < arr[ i ] ) {
                    temp[ i ] = val;
                } else {
                    while ( !stack.isEmpty () && stack.peek () >= arr[ i ] ) {
                        stack.pop ();

                        if ( stack.isEmpty () ) {
                            temp[ i ] = -1;
                        } else {
                            temp[ i ] = stack.peek ();
                        }
                    }
                }

            }
            stack.push ( arr[ i ] );

        }

        printArray ( temp, size, "right side element check" );
    }

    public static void main ( String args[] ) {
        int arr[] = {2, 45, 21, 3, 67, 8};
        findSmallestElemnt ( arr, arr.length );

    }
}
