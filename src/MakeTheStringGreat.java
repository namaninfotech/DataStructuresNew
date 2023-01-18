import java.util.Map;
import java.util.Stack;

public class MakeTheStringGreat {

    static String change(String s)
    {
        if(s.length()==1)
            return s;
        StringBuilder d=new StringBuilder();
        Stack<Character> stack=new Stack<>();
        stack.push(s.charAt(0));

        for(int i=1;i<s.length();i++)
        {
            char current=s.charAt(i);
            if(!stack.isEmpty()) {
                int difference = Math.abs(current - stack.peek());
                if (difference == 32) {
                    stack.pop();
                } else {
                    stack.push(current);
                }
                System.out.println(stack);
            }
            else
                stack.push(current);
        }

        if(stack.isEmpty())
            return "";
        while(!stack.isEmpty())
        {
            d.append(stack.pop());
        }
        return d.reverse().toString();
    }

    public static void main(String args[])
    {
        String s="abBAcC";
        System.out.println(change(s));

    }
}
