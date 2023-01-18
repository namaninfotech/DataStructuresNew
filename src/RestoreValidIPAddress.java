import java.util.ArrayList;

public class RestoreValidIPAddress {

    public static ArrayList<String> getValidAddress(String s) {
        ArrayList<String> list = new ArrayList<>();

        check(s, 0, list, "", 0);
        return list;
    }

    public static void check(String s, int i, ArrayList<String> list, String ans, int part) {
        if (s.length() == i || part == 4) {
            if (s.length() == i && part == 4)
                list.add(ans.substring(0, ans.length() - 1));
            return;
        }

        check(s, i + 1, list, ans + s.charAt(i) + '.', part + 1);

        if (i + 2 <= s.length() && isValid(s.substring(i, i + 2)))
            check(s, i + 2, list, ans + s.substring(i, i + 2) + '.', part + 1);
        if (i + 3 <= s.length() && isValid(s.substring(i, i + 3)))
            check(s, i + 3, list, ans + s.substring(i, i + 3) + '.', part + 1);
    }

    public static boolean isValid(String s) {
        if (s.charAt(0) == '0')
            return false;
        int y = Integer.parseInt(s);
        return y <= 255;
    }

    public static void main(String args[]) {
        String s = "25525511135";
        ArrayList<String> list = getValidAddress(s);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
