
import java.util.SortedMap;
import java.util.TreeMap;

public class MaximumIceCreamBars {

    static int find(int[] arr,int coins)
    {
        int count =0;
        SortedMap<Integer,Integer> map=new TreeMap<>();

        for(int i:arr)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for(var entry : map.entrySet())
        {
            int key = entry.getKey();
            int value = entry.getValue();

            int total = key * value;

            if(total > coins)
            {
                count += coins/key;
                break;
            }
            else{
                count+=value;
                coins = coins-total;
            }
        }


        return count;
    }

    public static void main(String args[])
    {
        int[] arr = {1,3,2,4,1};
        int coins =7;
        System.out.println(find(arr,coins));
    }
}
