public class RepeatedSubstringPattern {
    public static boolean find(String s)
    {
        StringBuilder temp= new StringBuilder();
        for(int i=0;i<s.length()/2;i++)
        {
            temp.append(s.charAt(i));
            if(s.substring(i+1).length()%temp.length() == 0 )
            {
                if(isMatch(s.substring(i+1),temp.toString()))
                    return true;
            }

        }


        return false;
    }

   static boolean isMatch(String target, String key)
    {
        int size = key.length();
        int j=0;
        while(j<target.length())
        {

            String temp = target.substring(j,j+size);

            if(!key.equals(temp))
             return false;

            j=j+size;

        }

        return true;
    }


public static void main(String args[])
{
    String s="abcabcabcabc";
    System.out.println(find(s));


}
}
