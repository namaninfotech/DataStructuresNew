
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IsoMorphicString {
    
    public static void main(String args[])
    {
    
      System.out.println( result("badc","baba"));
    }

    public static boolean result ( String s, String t ) {
       
        if(s.length()!=t.length())
            return false;
        
        HashMap<Character,Character> map=new HashMap<>();
        List<Character> list=new ArrayList<>();
        
        
        for(int i=0;i<s.length();i++)
        {
            char chS=s.charAt(i);
            char chT=t.charAt ( i );
           
            if(map.containsKey ( chS))
            {
                char comp=map.get ( chS);
                if(comp!=chT)
                    return false;
            }
            else
            {
                if(list.contains ( chT))
                    return false;
              map.put(chS,chT);
              list.add(chT);
            }
        }
        
        return true;
    }

  
}
