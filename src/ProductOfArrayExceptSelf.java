public class ProductOfArrayExceptSelf {
    static int[] find(int[] array)
    {
        int[] ans=new int[array.length];
        ans[0]=array[0];
        int rightProduct=1;

        for(int i=1;i< array.length;i++)
        {
            ans[i]=array[i]*ans[i-1];
        }
        ans[array.length-1]=ans[array.length-2];
        rightProduct*=array[array.length-1];

        for(int i=array.length-2;i>0;i--)
        {
            ans[i]=ans[i-1]*rightProduct;
            rightProduct*=array[i];
        }
        ans[0]=rightProduct;

        return ans;
    }

    public static void main(String args[])
    {
      int[] array={1,2,3,4};

      int[] ans=find(array);

      System.out.print("{");
      for(int i:ans)
      {
          System.out.print(i+", ");
      }
        System.out.print("}");
    }
}
