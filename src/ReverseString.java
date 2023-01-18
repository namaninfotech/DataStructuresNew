/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author naman.khanna
 */
public class ReverseString {

    public static void reverse ( String s[] ) {

        int start = 0;
        int end = s.length - 1;

        while ( start < end ) {
            String temp = s[ start ];
            s[ start ] = s[ end ];
            s[ end ] = temp;

            start++;
            end--;
        }
    }

    public static void main ( String args[] ) {

        String s[] = {"h", "e", "l", "l", "o"};
        reverse(s);
        for(int i=0;i<s.length;i++)
            System.out.print(s[i]+",");
    
  
    }
    
    
}
