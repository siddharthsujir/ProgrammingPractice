package com.company;

public class MaximumSumInArray {

    public static int maxSum(int[] arr)
    {
        int max_so_far=0,max_now=0;

        for(int i=0;i<arr.length;i++)
        {
            max_now=max_now+arr[i];

            if(max_now<0)
                max_now=0;

            if(max_so_far<max_now)
                max_so_far=max_now;
        }
        return max_so_far;
    }

    public static void main(String[] args)
    {
        int[] arr={-2, -3, -4, -1, -2, -1, -5, -3};

        System.out.println(maxSum(arr));
    }
}
