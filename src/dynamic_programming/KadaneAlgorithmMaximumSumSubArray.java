package dynamic_programming;

public class KadaneAlgorithmMaximumSumSubArray {

    static  int find(int[] arr)
    {
        int currentSum =arr[0];
        int bestSum = arr[0];

        for(int i=1;i< arr.length;i++)
        {

            if(currentSum>0)
            {
                currentSum = currentSum+arr[i];
            }
            else{
                currentSum =arr[i];
            }

            if(currentSum>bestSum)
            {
                bestSum=currentSum;
            }


        }

        return bestSum;

    }

    public static void main(String args[])
    {
        int arr[] = {-5,-3,-5};

        System.out.println(find(arr));
    }
}
