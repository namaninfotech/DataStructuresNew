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
public class SwapAllOddAndEvenBits {
    
    static void swap(int x)
    {
    
        int preserveOddBits=0x55555555;
        int preserveEvenBits=0xAAAAAAAA;
        
        int odd=preserveOddBits&x;
        int even=preserveEvenBits&x;
        
        odd<<=1;
        even>>=1;
        
        x=odd | even;
        System.out.println(Integer.toBinaryString ( x ));
    }

public static void main(String args[])
{
    int x=5;
    swap(x);
}
}
