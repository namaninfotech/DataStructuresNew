public class FactorialTrailingZero {

 static int find(int number)
 {
     int res=0;

     for(int i=5;i<=number;i=i*5)
     {
         res=res+number/i;
     }
     return res;
 }
    public static void main(String args[])
    {
        int number=251;
        System.out.println(find(number));
    }
}
