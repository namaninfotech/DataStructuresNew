import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {

    static int find(String word) {
        if (word.length() == 1)
            return 1;

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            map.put(word.charAt(i), map.getOrDefault(word.charAt(i), 0) + 1);
        }

        int length = 0;
        boolean oddValue = false;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char key = entry.getKey();

            if (map.get(key) % 2 == 0) {
                length += map.get(key);
            } else {
                length += map.get(key) - 1;
                oddValue = true;
            }
        }
        if (oddValue)
            length++;


        return length;
    }

    public static void main(String args[]) {
        String word = "aaAbccccdd";
        System.out.println(find(word));
    }
}
