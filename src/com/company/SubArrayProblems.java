package com.company;

import java.util.HashSet;

public class SubArrayProblems {

    public static void main(String[] args)
    {
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        //printSubArrays(arr);
        //sumOfAllSubArrays(arr);
        //subArrayOfSizeKwithPerfectSquareSums(arr,3);
        //maxSumofContiguousDistinctSubArray(arr);
        System.out.println(maxSubArray(arr));;
    }

    public static int maxSubArray(int[] nums) {

        int max_ending_here=0;
        int max_so_far=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++)
        {
            max_ending_here=max_ending_here+nums[i];
            max_so_far=Math.max(max_ending_here,max_so_far);
            if(max_ending_here<0)
                max_ending_here=0;
        }
        return max_so_far;
    }

    public static void maxSumofContiguousDistinctSubArray(int[] arr)
    {
        int i=0,j=0;
        HashSet<Integer> hs=new HashSet();
        int sum=0,maxSum=arr[0];
        while(i<arr.length-1 && j< arr.length)
        {
            if(hs.contains(arr[j]))
            {
                hs.remove(arr[i]);
                sum-=arr[i];
                i++;
            }
            else
            {
                sum+=arr[j];
                maxSum=sum>maxSum?sum:maxSum;
                hs.add(arr[j]);
                j++;
            }
        }
        System.out.println(maxSum);
    }

    public static void printSubArrays(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                for(int k=i;k<=j;k++)
                    System.out.print(" "+arr[k]);

                System.out.println();
            }
            System.out.println();
        }
    }

    public static void sumOfAllSubArrays(int[] arr)
    {
        int resut=0,temp=0;
        for(int i=0;i<arr.length;i++)
        {
            temp=0;
            for(int j=i;j<arr.length;j++)
            {
                temp+=arr[j];
                resut+=temp;
            }
            System.out.println();
        }
        System.out.println(resut);
    }

    public static void subArrayOfSizeKwithPerfectSquareSums(int[] arr, int k)
    {
        for(int i=0;i<=arr.length-k;i++)
        {
            int sum=findSumOfSubArray(arr,i,i+k-1);
            double sqrt=Math.sqrt(sum);
            if(sqrt-Math.floor(sqrt)==0)
                System.out.println(sum);
        }

        System.out.println("-1");

    }

    public static int findSumOfSubArray(int[] arr,int start,int end)
    {
        int sum=0;
        for(int i=start;i<=end;i++)
        {
            sum+=arr[i];
        }
        return sum;
    }
}
