/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Arrays;

/**
 *
 * @author naman.khanna
 */
public class CandyDistributionProblem {
    public static int findDistributions(int array[],int n)
    {
      int count=0;
      int LeftToRight[]=new int[n];
      Arrays.fill ( LeftToRight, 1);
      int RightToLeft[]=new int[n];
      Arrays.fill ( RightToLeft, 1); 
      //LeftToRight
      for(int i=1;i<n;i++)
      {
         if(array[i]>array[i-1])
             LeftToRight[i]=LeftToRight[i-1]+1;
      }
    
      //RightToLeft
      for(int i=n-2;i>=0;i--)
      {
         if(array[i]>array[i+1])
             RightToLeft[i]=RightToLeft[i+1]+1;
      }
      
      //find final traveseral
      for(int i=0;i<n;i++)
      {
        count+=Math.max(LeftToRight[i],RightToLeft[i]);
      }
      return count;
    }
  public static void main(String args[])
  {
      int array[]={23,14,15,14,56,29,14};
      System.out.println(findDistributions ( array, array.length));
  }
}
