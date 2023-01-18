import java.util.*;

public class StrictlyPreviousSmallestElement {

    static int[] find(int arr[] )
    {
        int[] ans=new int[arr.length];

        TreeSet<Integer> set=new TreeSet<>();
        for(int i=0;i<arr.length;i++)
        {
            set.add(arr[i]);

            int firstElement= set.first();

            if(firstElement==arr[i])
                ans[i]=-1;
            else {
                SortedSet<Integer> s = set.headSet(arr[i]);
                ans[i]=s.last();
            }
        }

        return ans;
    }

    public static void main(String args[])
    {
      int arr[]={2, 3, 4, 5, 1};
      int ans[]=find(arr);

      for(int element:ans)
          System.out.print(element+", ");
    }
}
