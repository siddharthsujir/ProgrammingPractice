package com.company;

public class SubArrayProblems {

    public static void main(String[] args)
    {
        int[] arr={1,2,3,4};
        //printSubArrays(arr);
        //sumOfAllSubArrays(arr);
        subArrayOfSizeKwithPerfectSquareSums(arr,3);
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
