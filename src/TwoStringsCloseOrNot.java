import java.util.*;

public class TwoStringsCloseOrNot {

    static boolean result(String first, String second) {

        if (first.length() != second.length())
            return false;
        else {
            HashMap<Character, Integer> mapFirst = new HashMap<>();
            HashMap<Character, Integer> mapSecond = new HashMap<>();
            List<Integer> firstList=new ArrayList<>();
            List<Integer> secondList=new ArrayList<>();

            for (int i = 0; i < first.length(); i++) {
                mapFirst.put(first.charAt(i), mapFirst.getOrDefault(first.charAt(i), 0) + 1);
                mapSecond.put(second.charAt(i), mapSecond.getOrDefault(second.charAt(i), 0) + 1);
            }

            for(Character ch:mapFirst.keySet())
            {
                if(!mapSecond.containsKey(ch))
                    return false;
                else{
                    firstList.add(mapFirst.get(ch));
                    secondList.add(mapSecond.get(ch));
                }
            }
            Collections.sort(firstList);
            Collections.sort(secondList);

            if(firstList.equals(secondList))
                return  true;
        }
        return false;
    }

    public static void main(String args[]) {
        String first = "abz";
        String second = "bca";
        System.out.println(result(first, second));
    }
}
