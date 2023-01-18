package dynamic_programming;

public class CountNumberOfTexts {

    public static int count(String s)
    {
        int n=s.length();

        int mod=1000000007;

        int[] dp=new int[n+1];


        dp[0]=1;

        for(int i=1;i<=n;i++)
        {
            dp[i]=dp[i-1]%mod;

            if(i-2>=0 && s.charAt(i-2) == s.charAt(i-1))
            {
                dp[i]= (dp[i]%mod+dp[i-2]%mod)%mod;

                if(i-3>=0  && s.charAt(i-3) == s.charAt(i-2))
                {
                    dp[i] = (dp[i]%mod+dp[i-3]%mod)%mod;

                    if(i-4>=0 && s.charAt(i-4) == s.charAt(i-3) && (s.charAt(i-4)=='7' || s.charAt(i-4)=='9'))
                    {
                        dp[i]= (dp[i]%mod+dp[i-4]%mod)%mod;
                    }
                }
            }



        }

        return dp[s.length()];

    }

    public static void main(String args[])
    {
     String s= "22233";

     System.out.println(count(s));

    }
}
