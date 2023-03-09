import java.util.Arrays;

public class KokoEatingBananas {

    private static int find(int[] piles, int h) {


        Arrays.sort(piles);
        int max = piles[piles.length - 1];

        if (h == piles.length)
            return max;

        int low = 0;
        int high = max;
        int speed = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isPossible(piles, h, mid)) {
                high = mid - 1;
                speed = mid;
            } else {
                low = mid + 1;
            }

        }

        return speed;
    }


    static boolean isPossible(int[] piles, int h, int speed) {
        int time = 0;

        for (int element : piles) {
            time += (int) Math.ceil((element * 1.0) / speed);
        }

        return time <= h;
    }


    public static void main(String args[]) {
        int[] piles = {3, 6, 7, 11};
        int h = 2;

        System.out.println(find(piles, h));
    }
}
