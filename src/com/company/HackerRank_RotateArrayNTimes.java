package com.company;

public class HackerRank_RotateArrayNTimes {

    public static int[] nRotations(int[] arr, int d)
    {

        while(d>0)
        {
            arr=rotateArray(arr);
            d--;
        }

        return arr;

    }
    public static int[] rotateArray(int[] arr)
    {
        int firstElement=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=firstElement;
        return arr;
    }

    public static void main(String[] args)
    {

        int[] a={41,73,89,7,10,1,59,58,84,77,77,97,58,1,86,58,26,10,86,51};
        a=nRotations(a,10);

        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }

    }
}
