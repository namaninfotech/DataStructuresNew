public class ReplaceElementsWithGreatestElementOnRightSide {
    static int[] find(int arr[])
    {
        int ans[]=new int[arr.length];
        int largest=arr[arr.length-1];

        ans[arr.length-1]=-1;
        for(int i=arr.length-2;i>=0;i-- )
        {
            ans[i]=largest;
            if(largest<arr[i])
                largest=arr[i];
        }
        return ans;
    }

    public static void main(String args[])
    {
        int arr[]={17,18,5,4,6,1};
        int ans[]=find(arr);
        for(int element:ans)
            System.out.print(element+", ");
    }
}
