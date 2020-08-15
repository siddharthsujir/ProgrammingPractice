package com.company;

public class LeetCode_RotateArray {

    public static void rotate(int[] nums, int k) {

        while(k>0)
        {
            //System.out.println(k);
            nums=rotateArr(nums);
            k--;
        }

    }

    public static int[] rotateArr(int[] arr)
    {
        int temp=arr[arr.length-1];
        for(int i=0;i<arr.length;i++)
        {
            int val=arr[i];
            arr[i]=temp;
            temp=val;

        }
        return arr;
    }

    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5,6,7};
        rotate(arr,3);
    }
}
