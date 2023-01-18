
public class ReverseWordsinaString {

    
    public static String reverse(String s)
    {
     String h="";
     
     String array[]=s.split(" ");
     
     for(int k=0;k<array.length;k++)
     {
       if(!array[k].trim ().isEmpty ())
       {
         h=h.concat ( array[k] ).concat ( " ");
       
       }
     }
     

     return h.trim ();
    }

public static void main(String args[])
{
   String s="a good   example ";
   
   System.out.println(reverse(s));
}
}
