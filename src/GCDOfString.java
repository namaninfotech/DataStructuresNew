public class GCDOfString {

    static String find(String str1, String str2) {
        int n1 = str1.length();
        int n2 = str2.length();

        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        return str1.substring(0, gcd(n1, n2));
    }

    static int gcd(int x, int y) {
        int r = 0, a, b;
        a = Math.max(x, y); // a is greater number
        b = Math.min(x, y); // b is smaller number
        r = b;
        while (a % b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return r;
    }


    public static void main(String args[]) {
        String str1 = "ABABAB";
        String str2 = "ABAB";

        System.out.println(find(str1, str2));
    }
}
