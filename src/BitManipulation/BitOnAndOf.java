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
public class BitOnAndOf {

public static void main(String args[])
{

    int i=0;
    
    int y= i|(1<<3); // make bit 0->1 at position 3
    System.out.println(y);
    
    int number=0;
    for(int j=0;j<26;j++)
    {
       number=number | (1<<j);
    }
    System.out.println (Integer.toBinaryString ( number));
    
    System.out.println(Integer.toBinaryString ( y));
}
}
