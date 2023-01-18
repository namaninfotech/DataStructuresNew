package BitManipulation;

public class MonotoneIncreasing {

    static  int find(String s)
    {
        int countOne=0;
        int countFlip=0;

        for(int i=0;i<s.length();i++)
        {

            if(s.charAt(i) == '1')
            {
                countOne++;
            }

            if(s.charAt(i) == '0')
            {
                if(countOne>0)
                {
                    countFlip++;
                }
            }

            if(countOne < countFlip)
            {
                countFlip = countOne;
            }
        }
        return countFlip;
    }

    public static void main(String args[])
    {
        String s= "000011000";
        System.out.println(find(s));
    }
}
