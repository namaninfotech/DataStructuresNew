
package System.out;

import java.util.ArrayList;
import java.util.List;


public class GenerateParanthesis {
    
    
    public static List<String> find(int n)
    {
        List<String> list=new ArrayList<>();
        findAll("(",n,1,list,0);
        return list;
    }
     public static void findAll(String bracket,int n, int open,List<String> list,int close)
    {
       
        if(bracket.length()==n*2)
        {
            list.add(bracket);
            return;
        }
        
        if(open<n)
            findAll(bracket+"(",n,open+1,list,close);
        
        if(close<open)
            findAll(bracket+")",n,open,list,close+1);
        
    }
    public static void main(String args[])
    {
       int n=2;
       System.out.println(find(n));
    }
}
