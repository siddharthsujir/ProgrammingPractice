package com.company;

public class SticklerThief {

    //5, 5, 10, 100, 10, 5
    //1 2 3
    public static int stickerThief(int[] arr)
    {
        int sum=0;
        int sum2=0;

        for(int i=0;i<arr.length;i=i+2)
        {
            sum=sum+arr[i];
        }

        for(int i=1;i<arr.length;i=i+2)
        {
            sum2=sum2+arr[i];
        }

        if(sum>sum2)
            return sum;
        else
            return sum2;

    }

    public static void main(String[] args)
    {
        int[] arr={1,2,3};
        System.out.println(stickerThief(arr));
    }
}
