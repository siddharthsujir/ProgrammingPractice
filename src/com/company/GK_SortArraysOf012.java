package com.company;

public class GK_SortArraysOf012 {


    public static int[] sortArray(int[] arr)
    {
        int lo=0;
        int hi=arr.length-1;
        int mid=0, temp=0;

        while(mid<=hi)
        {
            switch (arr[mid]){
                case 0:
                    temp=arr[mid];
                    arr[mid]=arr[lo];
                    arr[lo]=temp;
                    mid++;
                    lo++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp=arr[mid];
                    arr[mid]=arr[hi];
                    arr[hi]=temp;
                    //mid++;
                    hi--;
                    break;
            }
        }
        return arr;
    }

    public static void main(String[] args)
    {
        int[] arr={0, 1, 0};
        arr=sortArray(arr);

        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}
