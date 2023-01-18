/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BitManipulation;

/**
 *
 * @author naman.khanna
 */
public class KernighanAlgorithm {

public static void main(String args[])
{
  int n=12;
  
  int count=0;
  while(n!=0)
  {
    int rmsb = (n & -n);
    n-=rmsb;
    count++;
  }
  System.out.println (count);

}
}
