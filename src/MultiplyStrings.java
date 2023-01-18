
import java.math.BigInteger;


public class MultiplyStrings {
  
  public static void result(String num1, String num2)  
  {
    BigInteger A=new BigInteger(num1);
    BigInteger B=new BigInteger(num2);
    
    BigInteger c=A.multiply ( B);
    System.out.println (c.toString ());
  }
    
  public static void main(String args[])
  {
     result("3456","12345678");
  
  }
}
