package com.company;

public class GK_RearrangeArray {

    public static int[] rearrangeArray(int[] arr)
    {
        int maxIndex=arr.length-1;
        int minIndex=0;
        int maxElement=arr[maxIndex]+1;

        for(int i=0;i<arr.length;i++)
        {
            if(i%2==0)
            {
                arr[i]+=(arr[maxIndex]%maxElement)*maxElement;
                maxIndex--;
            }
            else
            {
                arr[i]+=(arr[minIndex]%maxElement)*maxElement;
                minIndex++;
            }


        }

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=arr[i]/maxElement;
        }
        return arr;
    }
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5,6,7};

        arr=rearrangeArray(arr);

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
