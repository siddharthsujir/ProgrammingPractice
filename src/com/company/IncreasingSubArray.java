package com.company;

// [1,2,3,4]
// {1,2},{2,3},{3,4},{1,2,3},{2,3,4},{1,2,3,4}
public class IncreasingSubArray {


    public static int findIncreasingSubArrayCount(int[] arr) {
        int count = 0;
        int prev = 0;

        for (int i = 0; i < arr.length - 1; i++)
        {
            prev=0;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]>arr[i] && arr[j]>prev) {
                    count++;
                    prev = arr[j];
                }
                else
                    break;
            }
        }
        return count;
    }

    public static void main(String[] args)
    {
        int[] arr={1,3,2,4};
        System.out.println(findIncreasingSubArrayCount(arr));
    }
}
