package com.company;

public class HackerRank_MiniMaxSum {

    public static void miniMaxSum(int[] arr) {

        long sum=0;
        long minSum=0;
        long maxSum=0;
        int minElement=Integer.MAX_VALUE;
        int maxElement=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
            if (arr[i]<minElement) {
                minElement=arr[i];

            }
            if(arr[i]>maxElement)
            {
                maxElement=arr[i];
            }
        }

        minSum=sum-maxElement;
        maxSum=sum-minElement;

        System.out.println(minSum+" "+maxSum);


    }
    public static void main(String[] args)
    {

        int[] arr={256741038, 623958417, 467905213, 714532089, 938071625};
       miniMaxSum(arr);
    }
}
