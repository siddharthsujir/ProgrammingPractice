package com.company;

public class MoveXerosToRight {

    public static void main(String[] args)
    {
        int[] arr={1,2,0,4,2,0,3,5};
        moveZerosToRight(arr);
    }

    public static void moveZerosToRight(int[] arr)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr[count++]=arr[i];
            }


        }
        while(count<arr.length)
        {
            arr[count]=0;
            count++;
        }
        for (int i=0;i<arr.length;i++)
            System.out.println(arr[i]);

    }
}
