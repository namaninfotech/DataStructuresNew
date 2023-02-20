import java.util.Stack;

public class DecodeString {

    static String find(String s)
    {
        String currentString = "";
        String currentNumber = "";


        Stack<String> stack  =new Stack<>();

        for(int i=0;i<s.length();i++)
        {
            char curr = s.charAt(i);

            if(Character.isDigit(curr))
            {

                while(s.charAt(i) != '[')
                {
                    currentNumber= currentNumber+s.charAt(i);
                    i++;
                }
                System.out.println(currentNumber);

                stack.push(currentString);
                stack.push(currentNumber);
                currentNumber = "";
                currentString = "";
            }
            else if(Character.isLetter(s.charAt(i))) {

                currentString = currentString + s.charAt(i);
            }
            else {
                int previousNumber = Integer.parseInt(stack.pop());
                String previousString = stack.pop();

                String newString = "";
                for (int j=0;j<previousNumber;j++)
                {
                    newString = newString + currentString;
                }

                currentString = previousString + newString;

            }
        }

        return currentString;
    }


    public static void main(String args[])
    {
        String s = "3[a]2[bc]";
        System.out.println(find(s));
    }
}
