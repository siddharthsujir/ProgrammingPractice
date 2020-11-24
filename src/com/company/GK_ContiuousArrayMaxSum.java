package com.company;

public class GK_ContiuousArrayMaxSum {

    public static int findMaxSum(int[]arr)
    {
        int maxSum=arr[0];
        int maxSumEndinghere=0;

        for(int i=0;i<arr.length;i++)
        {
            maxSumEndinghere=maxSumEndinghere+arr[i];
            if(maxSum<maxSumEndinghere)
                maxSum=maxSumEndinghere;

            if(maxSumEndinghere<0)
                maxSumEndinghere=0;
        }
        return maxSum;
    }
    public static void main(String[] args)
    {
        int[] arr= {-2,-1,-3,-4};
        System.out.println(findMaxSum(arr));
    }
}
