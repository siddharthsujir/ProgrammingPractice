package com.company;

public class MergeSortedArrays {

    public static void main(String[] args)
    {
        int[] arr={2,4,6,10,11,15};
        int[] arr2={1,5,8,12,14,19};
        mergeSortedArrays(arr,arr2);
    }

    public static void mergeSortedArrays(int[] arr1,int[] arr2)
    {
        int len1=arr1.length;
        int len2=arr2.length;
        int i=0;
        int j=0;
        while(i<len1 && j<len2)
        {
            //System.out.print("loop "+i+" "+j);
            if(arr1[i]<arr2[j])
            {
                //System.out.print("arr1 ");
                System.out.print(arr1[i]+" ");
                i++;
            }
            else if(arr2[j]<arr1[i])
            {
                //System.out.print("arr2 ");
                System.out.print(arr2[j]+" ");
                j++;
            }

        }

        while(i<len1)
        {
            //System.out.print("arr11 ");
            System.out.print(arr1[i]+" ");
            i++;
        }
        while(j<len2)
        {
           // System.out.print("arr2 ");
            System.out.print(arr2[j]+" ");
            j++;
        }
    }
}
