public class DeleteColumnToMakeSorted {

    static int find(String s[]) {
        int ans = 0;

        for (int i = 0; i < s[0].length(); i++) {
            for (int j = 0; j < s.length - 1; j++) {
                char first = s[j].charAt(i);
                char second = s[j + 1].charAt(i);
                if (first > second) {
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        String[] s = {"cba", "daf", "ghi"};

        System.out.println(find(s));
    }
}
