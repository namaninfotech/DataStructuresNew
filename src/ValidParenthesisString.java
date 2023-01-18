import java.util.Stack;

// String  contains like (,),*=> can be (,) or empty string

public class ValidParenthesisString {

    static boolean find(String s) {

        Stack<Integer> bracket = new Stack();
        Stack<Integer> star = new Stack();


        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                bracket.push(i);
            } else if (s.charAt(i) == ')') {
                if (bracket.isEmpty() && star.isEmpty())
                    return false;
                else if (!bracket.isEmpty())
                    bracket.pop();
                else
                    star.pop();
            } else {
                star.push(i);
            }
        }

        while (!bracket.isEmpty()) {
            if (star.isEmpty())
                return false;
            else {
                int bracketTop = bracket.pop();
                int starTop = star.pop();

                if (starTop < bracketTop)
                    return false;
            }
        }
        return true;
    }

    public static void main(String ars[]) {
        String s = "(*))";//

        System.out.println(find(s));
    }
}
