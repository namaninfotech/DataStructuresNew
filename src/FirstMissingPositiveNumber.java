
import java.util.Arrays;


public class FirstMissingPositiveNumber {

    public static int find(int array[])
    {
      int count=1;
      
      Arrays.sort(array);
      
      for(int i=0;i<array.length;i++)
      {
         if(array[i]==count)
             count++;
      }
      
      return count;
    }

 public static void main(String args[])
 {
   int array[]={3,4,-1,1};
   System.out.println(find(array));
 
 }
}
