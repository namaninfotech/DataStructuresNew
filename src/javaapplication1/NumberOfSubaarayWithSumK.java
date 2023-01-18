/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.ComponentOrientation;
import java.util.HashMap;

/**
 *
 * @author naman.khanna
 */
public class NumberOfSubaarayWithSumK {

    private static void findSubArrayWithSumK ( int arr[], int size, int k ) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        int count=0;
        for ( int i = 0; i < size; i++ ) {
            sum+=arr[i];
        if(map.containsKey(sum-k))
            count=map.get(sum-k);
        else
            map.put ( sum, map.getOrDefault ( sum,0 )+1);
        }
        
        System.out.println(count);

    }

    public static void main ( String args[] ) {
        int arr[] = {10, 2, -2, -20, 10};
        findSubArrayWithSumK ( arr, arr.length,-10 );
    }
}
