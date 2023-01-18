/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import static java.lang.Math.abs;

public class RainWaterTrappinng {

    private static long trapWater ( int height[], int n ) {
        int maximum=0;
        int size=height.length;
        int leftMax[]=new int[size];
        int rightMax[]=new int[size];
        
        leftMax[0]=height[0];
        
        for(int i=1;i<size;i++)
        {
            if(height[i]>leftMax[i-1])
                leftMax[i]=height[i];
            else
                leftMax[i]=leftMax[i-1];
        }
        
        rightMax[size-1]=height[size-1];
        
        for(int i=size-2;i>=0;i--)
        {
             if(height[i]>rightMax[i+1])
                 rightMax[i]=height[i];
            else
                rightMax[i]=rightMax[i+1];
        }
        
        for(int i=0;i<size;i++)
        {
            maximum+=(Math.min(leftMax[i],rightMax[i])-height[i]);
        }    
        
        return maximum;
    }

    public static void main ( String args[] ) {
        int array[] = { 0, 1, 0, 2, 1, 0, 1,
                      3, 2, 1, 2, 1 };
        System.out.println (trapWater ( array, array.length ));
        abs(-2);
    }
}
