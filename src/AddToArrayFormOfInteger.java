import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class AddToArrayFormOfInteger {

    static List<Integer> find(int[] num, int k)
    {
        List<Integer> list=new ArrayList<>();

        StringBuilder concat = new StringBuilder();

        for(int number:num)
        {
            concat.append(number);
        }

        BigInteger a = new BigInteger(concat.toString());

        BigInteger sum = a.add(new BigInteger(String.valueOf(k)));

        splitNumber(list,String.valueOf(sum));
        return list;
    }


    static void splitNumber(List<Integer> list, String number)
    {
        for(int i=0;i<number.length();i++)
        {
            list.add(Integer.parseInt(Character.toString(number.charAt(i))));
        }
    }

    public static void main(String args[])
    {
        int arr[] = {1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};
        int k = 516;
        System.out.println(find(arr,k));
    }
}
