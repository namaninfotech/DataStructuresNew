// Done it using BINARY SEARCH

import java.util.Arrays;

public class MinimumTimeToCompleteTrips {

    private static int find(int[] time, int totalTrips) {

        Arrays.sort(time);
        long lower = 0;
        long higher = (long) time[time.length - 1] *totalTrips;

        long totalTime = (long) time[time.length - 1] *totalTrips;

        while (lower<higher)
        {
           long mid = (lower+higher)/2;
           long sum = 0;

            for(int item : time)
            {
                sum = sum + mid/item;
            }

            if(sum>=totalTrips)
            {
                totalTime = Math.min(totalTime, mid);
                higher=mid;
            }
            else
                lower=mid+1;
        }

        return (int)totalTime;
    }


    public static void main(String args[]) {
        int[] time = {1,2,3};
        int totalTrips = 5;

        System.out.println(find(time, totalTrips));
    }
}
