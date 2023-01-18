
import java.util.TreeSet;


public class DistinctElement3 {
    
 public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        
        TreeSet<Long>    ts= new TreeSet<>();
        for(int i=0;i<nums.length;i++)
        {
        Long large=ts.ceiling((long)nums[i]);
        Long small=ts.floor ( (long)nums[i]);
        
        if(large!=null && Math.abs ( large-nums[i])<=t)
            return true;
            
        if(small!=null && Math.abs ( small-nums[i])<=t)
            return true;
        
        ts.add ( (long)nums[i]);
        
        if(ts.size ()>k)
            ts.remove ((long)nums[i-k]);
        
        System.out.println("HERE"+ts.size ());
        }
        
        
        
        return false;
    }
public static void main(String args[])
{
  int arr[]={1,2,3,1};
  int k=3;
  int t=0;
System.out.println(containsNearbyAlmostDuplicate(arr,k,t));
}
}
