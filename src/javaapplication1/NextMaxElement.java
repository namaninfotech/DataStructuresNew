/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author naman.khanna
 */
public class NextMaxElement {

    private static void findNextMaxElement ( int a[] ) {
        ArrayList<Integer> list = new ArrayList<> ();
        Stack<Integer> stack = new Stack<> ();
        
        for ( int i = a.length-1; i >=0; i-- ) {
          
             while(!stack.isEmpty () &&  stack.peek () <= a[i])
             {
               stack.pop ();
             
             }
             int value= stack.isEmpty ()?-1: stack.peek();
             list.add ( value);
             stack.push ( a[i]);
          
        }
        
        for(int i=list.size ()-1;i>=0;i--)
            System.out.print(list.get ( i )); 
    }

    public static void main ( String args[] ) {
        int a[] = {2, 3, 2,2,2};
         findNextMaxElement ( a );
    }
}
