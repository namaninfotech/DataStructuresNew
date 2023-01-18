public class DetectCapital {

    static boolean find(String s)
    {

        int small = 0;
        int large = 0;

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)-'a'>=0 && s.charAt(i)-'a'<= 25)
            {
                small++;
            }
            else if(s.charAt(i)-'A'>=0 && s.charAt(i)-'A'<=25)
            {
                large++;
            }

        }
        if(small==0)
            return true;

        if(large==0)
            return true;

        if(s.charAt(0)-'A'>=0 && s.charAt(0)-'A'<=25 && large==1)
            return  true;

        return false;
    }

    public static void main(String args[])
    {
        String s= "goole";
        System.out.println(find(s));
    }
}
