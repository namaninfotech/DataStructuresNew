import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllAnagramsOfString {

    public static List<Integer> anagrams(String source, String pattern) {
        List<Integer> list = new ArrayList<>();

        if (source.length() < pattern.length())
            return list;
        Map<Character, Integer> mapOfPattern = new HashMap<>();
        Map<Character, Integer> mapOfSource = new HashMap<>();

        int front = pattern.length();
        int back = 0;
        //making map for pattern
        for (int i = 0; i < pattern.length(); i++) {
            mapOfPattern.put(pattern.charAt(i), mapOfPattern.getOrDefault(pattern.charAt(i), 0) + 1);
        }

        //making map for first source length= pattern length

        for (int i = 0; i < pattern.length(); i++) {
            mapOfSource.put(source.charAt(i), mapOfSource.getOrDefault(source.charAt(i), 0) + 1);
        }


        while (front < source.length()) {
            if (mapOfPattern.equals(mapOfSource)) {

                list.add(back);

            }
            System.out.println(front);
            //acquire in sourceMap

            mapOfSource.put(source.charAt(front), mapOfSource.getOrDefault(source.charAt(front), 0) + 1);
            //release from sourceMap

            char ch = source.charAt(back);
            if (mapOfSource.get(ch) == 1) {
                mapOfSource.remove(ch);
            } else {
                mapOfSource.put(ch, mapOfSource.get(ch) - 1);
            }

            front++;
            back++;
        }

        if (mapOfPattern.equals(mapOfSource)) {
            list.add(back);
        }

        return list;
    }


    public static void main(String[] args) {

        String source = "cbaebabacd";
        String pattern = "abc";
        List<Integer> list = anagrams(source, pattern);

        System.out.println(list);

    }
}
