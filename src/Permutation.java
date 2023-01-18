/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author naman.khanna
 */
public class Permutation {
   
    public static void permutation(String s1)
    {
        printPermutation ( s1, "");
        
   
    }
    
    
    public static void printPermutation(String s, String h)
    {
        if(s.length()==0)
        {
         System.out.println ( h);
          return;
        }
   
        for(int i=0;i<s.length();i++)
        {
            String left=s.substring ( 0, i);
            String right=s.substring (i+1);
            
            printPermutation ( left+right, h+s.charAt ( i ));
        
        }
    }
    
    public static void main(String args[])
    {
       String s1="ab";
       String s2="eidboaoo";
       permutation(s1);
    }
}
