
public class TwoKeysKeyboard {

    public static int find(int n)
    {
       int result=0;
        int previous=0;
        int current=1;
        
        while(current<n)
        {
            if(n%current == 0)
            {
                previous=current; //copy
                current+=previous; // paste
                    
                    result+=2;
                
            }
            else
            {
                current+=previous; // paste
                result++;
            }
                
            
            
        }
        
        return result;    
    }
    
    
    public static void main ( String args[] ) {

        System.out.println (find(9));
    }
}
