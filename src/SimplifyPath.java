import java.util.Stack;

public class SimplifyPath {

    public static String find(String path)
    {
        String[] array = path.split("/+");

        Stack<String> stack=new Stack<>();

        for(String element:array)
        {
            if(stack.size()>0 && element.equals(".."))
            {
                stack.pop();
            }
            else if(element.equals(".") || element.isEmpty())
            {
                continue;
            }
            else if(!element.equals(".."))
            {
                stack.push(element);
            }

        }

        StringBuilder stringBuilder=new StringBuilder();
        for(String element:stack)  //this will give the element from bottom of stack
        {
            stringBuilder.append("/").append(element);
        }



        return (stringBuilder.length()==0)?"/":stringBuilder.toString();
    }

    public static void main(String args[])
    {
        String path = "/home//route/";

        System.out.println(find(path));
    }
}
