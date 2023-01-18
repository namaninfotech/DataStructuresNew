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
public class BuyAndSellStocks {
    static int maxProfit(int[] array)
    {
        int count=0;
        int min=array[0];
        
        for(int i=1;i<array.length;i++)
        {
            if(min > array[i] )
             min= array[i];
            
            count+=array[i]-min;
        }
        
      return count;
    }
    
    public static void main(String args[])
    {
      int array[]={6,5,3,7,1,4};
     int result=maxProfit(array);
     System.out.println(result);
    }
}
