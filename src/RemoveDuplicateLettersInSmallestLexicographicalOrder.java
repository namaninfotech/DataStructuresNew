import java.util.Stack;

public class RemoveDuplicateLettersInSmallestLexicographicalOrder {


    public static String find(String s) {

        StringBuilder sb = new StringBuilder();
        int[] lastIndex = new int[26];

        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        boolean[] isReached = new boolean[26];
        Stack<Integer> stack = new Stack<>();


        for (int i = 0; i < s.length(); i++) {
            int currentValue = s.charAt(i) - 'a';

            if(isReached[currentValue]) continue;
            while(!stack.isEmpty() && stack.peek()>currentValue && i<lastIndex[stack.peek()])
                isReached[stack.pop()]=false;

                stack.push(currentValue);
                isReached[currentValue]=true;
        }

        while(!stack.isEmpty())
        {
            int stackTopValue=stack.pop();
            char reviveCharacter = (char) ('a'+stackTopValue);
            sb.append(reviveCharacter);
        }
        return sb.reverse().toString();

    }

    public static void main(String args[]) {
        String s = "bcabc";
        System.out.println(find(s));

    }

}
