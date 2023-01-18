/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.HashMap;


/**
 *
 * @author naman.khanna
 */
public class LongestConsecutiveSubsequence {
    
    	static int findLongestConseqSubseq(int arr[], int N)
	{
            int count=1;
	  HashMap<Integer,Boolean> map=new HashMap<>();
	  
          for(int i=0;i<arr.length;i++)
          {
             map.put ( arr[i], Boolean.TRUE);
          
          }
          
          for(int i=0;i<arr.length;i++)
          {
              if(map.containsKey (arr[i]-1))
              {
                map.put ( arr[i], Boolean.FALSE); 
              }   
             
          
          }
          
          
          
          for(int i=0;i<N;i++)
          {
             if(map.get(arr[i]) == Boolean.TRUE)
             {
                 int temp=1;
                 int var=arr[i]+1;
                while(map.containsKey (var))
                {
                  temp++;
                  var+=1;
                
                }
             
                if(temp>count)
                    count=temp;
             }
                 
          
          }
          
	  
	  
	return count;  
	}
    
    

    public static void main ( String args[] ) {

     int   N = 7;
int a[] = {1,9,3,10,4,20,2};
        
int ans=findLongestConseqSubseq(a, N);

System.out.println(ans);
    }
}
