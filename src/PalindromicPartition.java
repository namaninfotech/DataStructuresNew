import java.util.ArrayList;
import java.util.List;

public class PalindromicPartition {

    static List<List<String>> find(String s) {
        List<List<String>> result = new ArrayList<>();

        backtrack(s,result,new ArrayList<>());

        return result;
    }


    static void backtrack(String s  , List<List<String>> result, List<String> path)
    {
        if(s.length() == 0)
        {
            result.add(new ArrayList<>(path));
            return;
        }

        for(int i=0;i<s.length();i++)
        {
            if(isPalindrome(s.substring(0,i+1)))
            {
                path.add(s.substring(0,i+1));
                backtrack(s.substring(i+1),result,path);
                path.remove(path.size()-1);
            }
        }

    }

    static boolean isPalindrome(String s) {

        StringBuilder stringBuilder = new StringBuilder(s);

        StringBuilder reverseStringBuilder = new StringBuilder(s);
        reverseStringBuilder = reverseStringBuilder.reverse();

        return stringBuilder.toString().equals(reverseStringBuilder.toString());
    }

    public static void main(String args[]) {
        String s = "aab";
        System.out.println(find(s));
    }
}
