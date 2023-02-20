public class SearchInsertPosition {

    static int find(int[] nums, int target)
    {
        int low = 0;
        int high = nums.length-1;
        while(low<=high)
        {
          int mid =  low+((high-low)/2);

          if(target == nums[mid])
              return mid;
          else if(target>nums[mid])
              low=mid+1;
          else
              high=mid-1;

        }


        return low;
    }

    public static void main(String args[])
    {
        int num[] ={1,3,5,6};
        int target = 5;
        System.out.println(find(num,target));
    }
}
