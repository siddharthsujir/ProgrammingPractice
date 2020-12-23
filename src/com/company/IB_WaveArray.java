package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class IB_WaveArray {

    public static void main(String[] args)
    {
        int[] arr={5, 1, 3, 2, 4};//{1,2,3,4};

        arr=wave(arr);

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static int[] wave(int[] A) {

        Arrays.sort(A);
        for(int i=0;i<A.length-1;i++)
        {

                int temp=A[i];
                A[i]=A[i+1];
                A[i+1]=temp;
                i++;

        }

        return  A;
    }
}
