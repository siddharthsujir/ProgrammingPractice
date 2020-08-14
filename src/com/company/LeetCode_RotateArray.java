package com.company;

public class LeetCode_RotateArray {

    public static void rotate(int[] nums, int k) {

        while(k>0)
        {
            //System.out.println(k);
            nums=rotateArr(nums);
            k--;
        }

        for(int i=0;i<nums.length;i++)
            System.out.println(nums[i]);
    }

    public static int[] rotateArr(int[] arr)
    {
        int temp=arr[0];

        for(int i=0;i<arr.length-1;i++)
        {

            arr[i]=arr[i+1];

        }
        arr[arr.length-1]=temp;
        return arr;
    }

    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5,6,7};
        rotate(arr,2);
    }
}
