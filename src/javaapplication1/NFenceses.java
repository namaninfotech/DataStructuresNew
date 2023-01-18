/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

class color {

    int n1, n2, n3;

    color ( int n1, int n2, int n3 ) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }
}

public class NFenceses {

    public static int minTime ( color array[] ) {
        int count = 0;

        int previous = -1;

        for ( int i = 0; i < array.length; i++ ) {
            color value = array[ i ];

            if ( value.n1 < value.n2 && value.n1 < value.n2 ) //first condition
            {
                if ( previous == 1 ) {
                    if ( value.n2 < value.n1 ) {
                        count += value.n2;
                        previous = 2;
                    } else {
                        count += value.n3;
                        previous = 3;
                    }
                } else {

                    previous = 1;
                    count += value.n1;
                }
            } else if ( value.n2 < value.n1 && value.n2 < value.n3 ) {//second condition

                if ( previous == 2 ) {
                    if ( value.n1 < value.n3 ) {
                        count += value.n1;
                        previous = 1;
                    } else {
                        count += value.n3;
                        previous = 3;
                    }

                } else {
                    previous = 2;
                    count += value.n2;
                }
            } else if ( value.n3 < value.n1 && value.n3 < value.n2 ) {//third condition
                if ( previous == 3 ) {
                    if ( value.n1 < value.n2 ) {
                        count += value.n1;
                        previous = 1;
                    } else {
                        count += value.n2;
                        previous = 2;
                    }

                } else {
                    previous = 3;
                    count += value.n3;
                }

            }
        }

        return count;
    }
    
    
    
    
    public static void main(String args[])
    {
      color array[]={
      
      new color(2,9,4),
          new color(20,7,15),
          new color(18,12,19)
      };
    
      
      int result=minTime ( array );
      System.out.println(result);
    }
}
