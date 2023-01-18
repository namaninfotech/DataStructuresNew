
package javaapplication1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class Meetings
{
  int start;
  int end;
  int index;
  
  Meetings(int start, int end , int index)
  {
     this.start=start;
     this.end=end;
     this.index=index;
  }
}


public class NMeetings {
    
    private static void operation(int start[],int end[],int size)
    {
        
        int result=1;
        
        //comparator start
       Comparator<Meetings> com=(o1, o2)->{
       
  
        if (o1.end < o2.end)
        {
             
        
            return -1;
        }
        else if (o1.end > o2.end)
        
            return 1;
             
        return 0;
       
       };
       //comparator end
       
       ArrayList<Meetings> list=new ArrayList<>();
       
      for(int i=0;i<size;i++)
      {
        list.add(new Meetings(start[i],end[i],(i+1)));
      }
      
      Collections.sort(list, com);
      
      int previous=list.get(0).end;
      for(int i=1;i<size;i++)
      {
        System.out.println("value="+"("+list.get(i).start+","+list.get(i).end+","+
                list.get(i).index+")"
                );
      if(previous < list.get(i).start){
          previous=list.get(i).end;
          result++;
      }
          
      
      }
      
      System.out.println(result);
    }
    
  public static void main(String args[])
  {
      int start[]={1,3,0,5,8,5};
      int end[]={2,4,6,7,9,9};
      int size=start.length;
      operation(start,end,size);
  }
}
