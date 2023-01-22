import java.util.HashMap;

public class NumberOfSubArrayDivisibleByK {

    static  int find(int arr[],int k)
    {
        int count =0;
         int rem=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        map.put(0,1);


        for(int i:arr)
        {
            sum+=i;
             rem = sum%k;
            if(rem<0)
            {
                rem=rem+k;

            }

            if(map.containsKey(rem))
            {
                count+=map.get(rem);
                map.put(rem,map.get(rem)+1);
            }
            else{
                map.put(rem,1);
            }


        }



        return count;
    }


    public static void main(String args[])
    {
        int arr[] = {4,5,0,-2,-3,1};
        int k =5;
        System.out.println(find(arr,k));
    }
}
