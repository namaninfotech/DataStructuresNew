
public class MaximumLengthofRepeatedSubarray {
 
    public static int find(int nums1[], int nums2[])
    {
      int count=0;
    
      int dp[][]=new int[nums1.length+1][nums2.length+1];
      
      for(int i=1;i<nums1.length+1;i++)
      {
         for(int j=1;j<nums2.length+1;j++)
         {
            if(nums1[i-1]==nums2[j-1])
            {
                dp[i][j]=dp[i-1][j-1]+1;
                count=Integer.max ( dp[i][j], count);
            }
         
         }
      
      }
      
      return count;
    }
    
    
    
    
    public static void main(String args[])
  {
  
   int nums1[]={0,0,0,0,0};
   int nums2[]={0,0,0,0,0};
   
   System.out.println(find(nums1,nums2));
  }
}
