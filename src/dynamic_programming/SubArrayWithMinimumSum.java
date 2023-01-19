package dynamic_programming;

public class SubArrayWithMinimumSum {

    static int find(int arr[])
    {
        int currSum=0;
        int minSum = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            currSum = currSum+arr[i];

            minSum=Integer.min(currSum,minSum);

            if(currSum>0)
                currSum=0;

        }

        return minSum;
    }

    public static void main(String args[])
    {
        int arr[]={5,-3,5};
        System.out.println(find(arr));
    }
}
