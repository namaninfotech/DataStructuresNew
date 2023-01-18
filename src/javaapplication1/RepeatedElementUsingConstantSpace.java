
package javaapplication1;


public class RepeatedElementUsingConstantSpace {
    
    public static int find(int[] array)
    {
      int element=0;
      
      
      for(int i=0;i<array.length;i++)
      {
         int t=Math.abs ( array[i]);
         
         
         if(array[t%(array.length)] < 0)
         {
           element=t;
         }
         else
             array[t%array.length]=array[t%array.length]*(-1);
      }
      
      return element;
    }
    public static void main(String args[])
    {
       int array[]={1,3,4,2,3};
    
       System.out.println(find(array));
    }
}
