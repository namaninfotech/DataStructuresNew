import java.util.ArrayList;
import java.util.List;

public class RestoreIPAddress {

    static List<String> find(String s) {
        List<String> list = new ArrayList<>();

        if (s.length() > 12)
            return list;

        find(s,0,list,"",0);


        return list;
    }

    // 25525511135

    static void find(String s,int index, List<String> list, String filter, int part)
    {
        if(index == s.length() || part == 4)
        {
            if(index == s.length() && part == 4)
                list.add(filter.substring(0,filter.length()-1));

            return;

        }

        find(s,index+1,list,filter+s.charAt(index)+".",part+1);

        if(index+2<=s.length() && isValid(s.substring(index,index+2)))
        find(s,index+2,list,filter+s.substring(index,index+2)+".",part+1);

        if(index+3<=s.length() && isValid(s.substring(index,index+3)))
        find(s,index+3,list,filter+s.substring(index,index+3)+".",part+1);


    }

    static boolean isValid(String check)
    {
        if(check.charAt(0) == '0')
            return false;


        if(check.length() == 3)
        {
            int val = Integer.parseInt(check);
            if(val>255)
                return false;
        }

        return true;
    }

    public static void main(String args[]) {
        String s = "25525511135";
        System.out.println(find(s));

    }
}
