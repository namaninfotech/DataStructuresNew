
package System.out;


public class PartitionArrayIntoThreePartsWithEqualSum {

public static boolean find(int array[])
{
  int count=3;
  int sum=0;
  for(int i=0;i<array.length;i++)
  {
    sum+=array[i];
  }
  if(sum%3!=0)
      return false;
  System.out.println("Total Sum="+sum);
  
  int c=0;
  for(int i=0;i<array.length;i++)
  {
    c+=array[i];
   
    if(c==sum/3)
    {
      count--;
      c=0;
    }
  }

  return count==0;
}
 public static void main(String args[])
 {
   int array[]={1,1,1,1};
   System.out.println(find(array));
 }
}
