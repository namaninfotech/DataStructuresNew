package dynamic_programming;

public class ClimbStairsWithVariableJumpsMinMoves {

    static int findJumps(int arr[]) {

        Integer dp[] = new Integer[arr.length];
        dp[arr.length - 1] = 0;

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > 0) {
                int min = Integer.MAX_VALUE;
                for (int j = 1; j <= arr[i] && (i + j) < dp.length; j++) {
                    if (dp[i + j] != null) {
                        min = Math.min(min, dp[i + j]);
                    }
                }
                if (min != Integer.MAX_VALUE)
                    dp[i] = min + 1;
            }
        }
        return (dp[0] != null) ? dp[0] : -1;
    }


    public static void main(String args[]) {
        int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(findJumps(arr));
    }
}
