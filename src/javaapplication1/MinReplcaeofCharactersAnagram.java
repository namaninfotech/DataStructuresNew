/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author naman.khanna
 */
public class MinReplcaeofCharactersAnagram {
    
    private static int operations(String s1, String s2)
    {
        int count=0;
        HashMap<Character,Integer> map=new HashMap<>();
        
        
        for(int i=0;i<s1.length();i++)
        {
          if(!map.containsKey(s1.charAt(i)))
          {
            map.put(s1.charAt ( i ),1);
          }
          else
              map.put(s1.charAt(i),map.get (s1.charAt(i) )+1);
        
        }
        
        for(int i=0;i<s2.length();i++)
        {
            if(!map.containsKey ( s2.charAt(i)))
            {
               count+=1;
            }
            else
            {
               map.put(s2.charAt ( i ),(map.get( s2.charAt(i))-1));
                  
            }
           
        }
        
      return count;  
    }
    
 public static void main(String args[])
 {
     String s1="aaaaa";
     String s2="bbbbb";
      System.out.println(operations(s1,s2));
 }
}
