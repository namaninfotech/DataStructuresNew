public class RepeatedStringMatch {

    public static int find(String s1, String s2)
    {
        int count = 1;
        int s1Length = s1.length();
        int s2Length = s2.length();
        String s3=s1;

        while(count<=(s2Length/s1Length)+2)
        {
            if(s1.contains(s2))
            {
                return count;
            }
            s1+=s3;
            count++;


        }


        return -1;
    }


    public static void main(String args[])
    {
        String s1 = "abcd";
        String s2 = "cdabcdab";

        System.out.println(find(s1,s2));
    }
}
