package System.out;


public class MinimumMovestoReachTargetScore {

    
/*
    
increment =x+1
double = x*2 
    
    double count < maxDouble
*/
public static int find(int target, int maxDouble)
{
    int count=0;
int x=target;

while(target>1 && maxDouble!=0)
{
    if(target%2==0 )
    {
      target=target/2;
      maxDouble--;
    }
    else
        target=target-1;
    
    count++;

}
return count+(target-1);
}
public static void main(String args[])
{

int target=764138259;
int maxDouble=1;
    
    System.out.println(find(target,maxDouble));
}
}
