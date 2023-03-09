import java.util.Arrays;

public class EditDistance {

    static int find(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 0; i < n + 1; i++)
            Arrays.fill(dp[i], -1);
        return minDis(s1, s2,n, m,dp);
    }

    static int minDis(String s1, String s2,int n, int m,int dp[][]) {
        // If any String is empty,
        // return the remaining characters of other String
        if (n == 0)
            return m;
        if (m == 0)
            return n;

        // To check if the recursive tree
        // for given n & m has already been executed
        if (dp[n][m] != -1)
            return dp[n][m];

        // If characters are equal, execute
        // recursive function for n-1, m-1
        if (s1.charAt(n - 1) == s2.charAt(m - 1)) {
            return dp[n][m] = minDis(s1, s2, n - 1, m - 1, dp);
        }
        // If characters are nt equal, we need to
        // find the minimum cost out of all 3 operations.
        else {

            int insert, del, replace; // temp variables

            insert = minDis(s1, s2, n, m - 1, dp);
            del = minDis(s1, s2, n - 1, m, dp);
            replace = minDis(s1, s2, n - 1, m - 1, dp);
            return dp[n][m]
                    = 1 + Math.min(insert, Math.min(del, replace));

        }
    }


    public static void main(String args[]) {
        String s1 = "horse";
        String s2 = "ros";

        System.out.println(find(s1, s2));
    }
}
