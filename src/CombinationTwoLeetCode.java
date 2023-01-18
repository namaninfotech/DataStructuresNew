import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationTwoLeetCode {

    public static List<List<Integer>> get(int arr[],int target)
    {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(arr);
      find(0,list,new ArrayList<Integer>(),arr,target);
        return list;
    }


    public static void find(int index,List<List<Integer>> list,List<Integer> ans,int[] arr,int target){

        if(target == 0)
        {
            list.add(new ArrayList<>(ans));
            return;
        }

        for(int i=index;i<arr.length;i++)
        {
            if(i>index && arr[i] ==arr[i-1]) continue;

            if(arr[i]>target)
                break;

            ans.add(arr[i]);
            find(i+1,list,ans,arr,target-arr[i]);
            ans.remove(ans.size()-1);
        }

    }
    public static void main(String args[])
    {
           int arr[]={10,1,2,7,6,1,5};
           int target=8;
          List<List<Integer>> list= get(arr,target);

          for(int i=0;i<list.size();i++)
          {
              System.out.println(list.get(i));

          }
    }
}
