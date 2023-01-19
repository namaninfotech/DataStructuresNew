public class MaximumSumCircularSubArray {


    static int find(int[] arr) {


        boolean allNegative=true;
        for(int i:arr)
        {
            if(i>0)
            {
                allNegative=false;
                break;
            }

        }


        int currSum = arr[0];
        int maxSum = arr[0];
        int kadaneMaxSum;



        for (int i = 1; i < arr.length; i++) {

            int currentElement = arr[i];
            if(currSum>0)
            {
                currSum+=currentElement;
            }
            else{
                currSum= currentElement;
            }

            if(maxSum<currSum)
                maxSum=currSum;

        }

        if(allNegative)
            return  maxSum;
        kadaneMaxSum=maxSum;



        currSum=0;
        int minSum = Integer.MAX_VALUE;
        int totalSum = 0;

        for(int i=0;i<arr.length;i++)
        {
            totalSum+=arr[i];
            currSum+=arr[i];
            minSum = Integer.min(currSum,minSum);

            if(currSum>0)
                currSum=0;

        }


        System.out.println(minSum);
        int finalSum = totalSum-minSum;

        return (Integer.max(kadaneMaxSum,finalSum));
    }

    public static void main(String args[]) {
        int arr[] = {-5,-3,-5};
        System.out.println(find(arr));
    }
}
