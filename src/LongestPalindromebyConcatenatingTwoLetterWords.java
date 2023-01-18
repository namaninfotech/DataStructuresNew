import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestPalindromebyConcatenatingTwoLetterWords {


    static int find(String[] words)
    {
        int length=0;
        HashMap<String,Integer> map=new HashMap<>();
        boolean central =false;
        List<String> list=new ArrayList<>();


        for(String word:words)
        {
              map.put(word,map.getOrDefault(word,0)+1);
        }
        System.out.println(map);


        for(Map.Entry<String,Integer> entry:map.entrySet())
        {
            String w = entry.getKey();

            if(w.charAt(0) == w.charAt(1) && !list.contains(w))
            {
                if(map.get(w)%2 ==0 ) {
                    length += map.get(w);
                }else {
                    length+=map.get(w)-1;
                    central=true;
                }
                list.add(w);
            }
            else if(!list.contains(w)){
                StringBuilder sb = new StringBuilder(w);
                String reverse= sb.reverse().toString();
                if(map.containsKey(reverse))
                {
                    length+=2*Math.min(map.get(w),map.get(reverse));
                    list.add(w);
                    list.add(reverse);
                }

            }
        }

        if(central)
            length++;


        return length*2;
    }

    public static void main(String args[])
    {
        String[] words = {"ll","lb","bb","bx","xx","lx","xx","lx","ll","xb","bx","lb","bb","lb","bl","bb","bx","xl","lb","xx"};
        System.out.println(find(words));
    }
}
