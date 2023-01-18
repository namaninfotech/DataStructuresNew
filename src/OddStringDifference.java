import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class OddStringDifference {


    static String find(String[] words)
    {
        HashMap<List<Integer>,List<String>> map=new HashMap<>();
        String unique="";


        for(String word:words)
        {
            List<Integer> list =new ArrayList<>();
            for(int i=1;i<word.length();i++)
            {
                int difference= (word.charAt(i)-'a')-(word.charAt(i-1)-'a');
                list.add(difference);
            }

            if(map.containsKey(list))
            {
                List<String> stringList=map.get(list);
                stringList.add(word);
                map.put(list,stringList);
            }
            else{
                List<String> stringList=new ArrayList<>();
                stringList.add(word);
                map.put(list,stringList);
            }
        }


        for(List<Integer> key:map.keySet())
        {
            List<String> value=map.get(key);
            if(value.size()>1)
                continue;
            else {
                unique = value.get(0);
                break;
            }
        }

        return unique;


    }

 public static void main(String args[])
 {
     String[] words={"aaa","bob","ccc","ddd"};
     System.out.println(find(words));

 }
}

