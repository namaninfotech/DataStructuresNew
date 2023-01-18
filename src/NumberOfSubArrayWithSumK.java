import java.util.HashMap;

public class NumberOfSubArrayWithSumK {

    public static int count(int arr[],int k)
    {
        int count=0;
        int sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int value : arr)
        {
            sum=sum+value;

            if(map.containsKey(sum-k))
            {
                count+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);



        }


        return count;
    }

    public static void main(String args[])
    {
        int arr[]={9, 4, 20, 3, 10, 5};
        int k=33;
        int result=count(arr,k);

        System.out.println(result);

    }
}
