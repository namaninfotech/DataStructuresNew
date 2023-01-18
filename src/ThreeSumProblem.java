
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumProblem {

    public static List<List<Integer>> findSum(int nums[]) {

        List<List<Integer>> list = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length-2; i++) {
            int a = -nums[i];
            int low = i + 1;
            int high = nums.length - 1;

            if (i == 0 || nums[i] != nums[i - 1]) {

                while (low < high) {
                    int sum=nums[low] + nums[high];
                    if (sum == a) {
                        List<Integer> temp = new ArrayList();
                        temp.add(nums[i]);
                        temp.add(nums[low]);
                        temp.add(nums[high]);

                        list.add(temp);

                        while(low < high && nums[low]==nums[low+1]) low++;
                        while(low < high && nums[high]==nums[high-1]) high--;
                        low++;
                        high--;
                    }
                    else if(sum > a)
                        high--;
                    else
                        low++;
                }
            }
        }
        return list;
    }

    public static void main(String args[]) {

        int nums[] = {-1, 0, 1, 2, -1, -4};
        System.out.println(findSum(nums));
    }

}