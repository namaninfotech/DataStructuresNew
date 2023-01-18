package dynamic_programming;

public class TargetSumSubSet {

    static boolean findResult(int arr[], int target) {
        boolean dp[][] = new boolean[arr.length + 1][target + 1];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {

                if (i == 0 && j == 0) {
                    dp[i][j] = true;
                } else if (i == 0) {
                    dp[i][j] = false;
                } else if (j == 0) {
                    dp[i][j] = true;
                } else {

                    if (dp[i - 1][j] == true) {
                        dp[i][j] = true;
                    } else {

                        int val = arr[i - 1];

                        if (val <= j) {
                            dp[i][j] = dp[i - 1][j - val];
                        }
                    }
                }
            }
        }
       return dp[arr.length][target];
    }

    public static void main(String args[]) {
        int arr[] = {3, 34, 4, 12, 5, 2};
        int target = 10;

        System.out.println(findResult(arr,target));
    }

}
