
package javaapplication1;

public class MaximumProductSubarray {
    
    public static int find(int arr[])
    {
      int n=arr.length;
      boolean isZero=false;
      
      //LeftToRight
      int min=Integer.MIN_VALUE;
      int currProduct=1;
      
      
      for(int i=0;i<n;i++)
      {
        currProduct*=arr[i];
        if(currProduct==0)
        {
            currProduct=1;
            isZero=true;
            continue;
            
        }
        if(min<currProduct)
            min=currProduct;
      }
    
      //RightToLeft
      
      int minSecond=Integer.MIN_VALUE;
      int currProductSecond=1;
      for(int i=n-1;i>=0;i--)
      {
        currProductSecond*=arr[i];
        if(currProductSecond==0)
        {
            currProductSecond=1;
            isZero=true;
            continue;
            
        }
        if(minSecond<currProductSecond)
            minSecond=currProductSecond;
      }
      
      int res=Math.max ( min, minSecond);
      
      if(isZero)
          return Math.max(res,0);
      return res;
    }

public static void main(String args[])
{
  int array[]={2, 3, 4, 5, -1, 0};
  System.out.println(find(array));
}
}
