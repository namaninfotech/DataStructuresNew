/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Stack;

/**
 *
 * @author naman.khanna
 */
public class BracketsProblem {

    public static boolean isValid ( String s ) {
        if ( s.length () <= 1 ) {
            return false;
        }
        Stack<Character> stack = new Stack<> ();

        for ( int i = 0; i < s.length (); i++ ) {
            char ch = s.charAt ( i );
            if ( ch == '(' || ch == '[' || ch == '{' ) {
                stack.push ( ch );
                System.out.println ( stack.size () );
            } else {
                if ( stack.empty () ) {
                    return false;
                } else {
                    char comp = stack.pop ();

                    if ( comp == '(' && ch == ')' ) {
                    } else if ( comp == '{' && ch == '}' ) {
                    } else if ( comp == '[' && ch == ']' ) {
                    } else
                        return false;
                    
                }
                

            }
        }
        
        if(stack.empty ())
            return true;

        return false;

    }

    public static void main ( String args[] ) {
        String s = "()";
        System.out.println ( isValid ( s ) );
    }
}
