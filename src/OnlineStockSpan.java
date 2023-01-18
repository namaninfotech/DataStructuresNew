import java.util.Stack;

class Pair{
    int index;
    int value;

    Pair(int index,int value)
    {
        this.index=index;
        this.value=value;
    }
}

public class OnlineStockSpan {

    static int[] find(int arr[]) {

        int[] ans=new int[arr.length];
        Stack<Pair> stack=new Stack<>();

        for(int i=0;i<arr.length;i++)
        {
            if(i==0)
            {
                stack.push(new Pair(i,arr[i]));
                ans[i]=1;
            }
            else {

                while (!stack.isEmpty()) {
                    Pair topPair = stack.peek();

                    if (topPair.value < arr[i])
                        stack.pop();
                    else
                        break;
                }
                if (stack.isEmpty()) {
                    ans[i] = 1 + i;
                } else{
                    ans[i] = i - stack.peek().index;
            }
                stack.add(new Pair(i,arr[i]));

            }
        }

        return ans;
    }

    public static void main(String args[]) {
        int[] arr = {10, 4, 5, 90, 120, 80};
        int[] ans=find(arr);
        for(int element:ans)
        {
            System.out.print(element+", ");
        }
    }
}
