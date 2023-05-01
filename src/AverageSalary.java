public class AverageSalary {

    public static double find(int[] salary)
    {
        int ans=0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;


        for(int value : salary)
        {
            max = Integer.max(max,value);
            min = Integer.min(min,value);

            ans +=value;
        }

        return (ans- (double) (min + max)) /(salary.length-2);
    }


    public static void main(String args[])
    {
        int[] salary = {4000,3000,1000,2000};

        System.out.println(find(salary));
    }
}
