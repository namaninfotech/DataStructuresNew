public class FindTheIndexOfTheFirstOccurrenceInAString {


    static  int find(String haystack, String needle)
    {
        int needleLength = needle.length();
        if(haystack.contains(needle))
        {
            for(int i=0;i<haystack.length();i++)
            {
                if(haystack.charAt(i) == needle.charAt(0))
                {
                     if((i+needleLength)<=haystack.length())
                     {
                         String check = haystack.substring(i,(i+needleLength));

                         if(check.equals(needle))
                             return i;
                     }
                }
            }
        }


        return -1;
    }

    public static void main(String args[])
    {
        String haystack = "kadbutsad";
        String needle="sad";
        System.out.println(find(haystack,needle));
    }
}
