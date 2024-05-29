package com.javaex;

public class Kata {
    public static int[] countBy(int x, int n){
        int[] arr = new int[n];
        for(int i=0; i< arr.length; i++){
            arr[i] = (i+1)*x;
        }
        return arr;
    }
}
