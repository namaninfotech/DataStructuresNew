package dynamic_programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// This is an O(n^2) solution

class Job implements Comparable<Job> {
    int start, finish, profit;

    Job(int start, int finish, int profit) {
        this.start = start;
        this.finish = finish;
        this.profit = profit;
    }

    public int compareTo(Job object) {
        if (this.finish > object.finish)
            return 1;
        else if (this.finish < object.finish)
            return -1;

        return 0;
    }
}

public class MaximumProfitJobSchedulingKnapSack {

    static int maxProfit(int[] start, int[] end, int[] profit) {

        //sort according to the end time
        List<Job> list = new ArrayList<>();
        for (int i = 0; i < start.length; i++) {
            list.add(new Job(start[i], end[i], profit[i]));
        }

        Collections.sort(list);

        int dp[] = new int[start.length];

        dp[0] = list.get(0).profit;
        for (int i = 1; i < start.length; i++) {
            Job currentIndex = list.get(i);
            dp[i] = currentIndex.profit;
            for (int j = i - 1; j >= 0; j--) {
                Job previousIndex = list.get(j);

                if (previousIndex.finish <= currentIndex.start) {
                    dp[i] = Integer.max(dp[i], (dp[j] + currentIndex.profit));
                }
            }
        }

        int max = Integer.MIN_VALUE;
        for (int s : dp) {
            if (max < s)
                max = s;
        }
        return max;
    }

    public static void main(String arg[]) {

        int[] start = {1, 2, 3, 4, 6};
        int[] end = {3, 5, 10, 6, 9};
        int[] profit = {20, 20, 100, 70, 60};
        System.out.println(maxProfit(start, end, profit));
    }
}
