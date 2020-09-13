package com.company;

public class SubArrayProblems {

    public static void main(String[] args)
    {
        int[] arr={1,2,3,4};
        //printSubArrays(arr);
        sumOfAllSubArrays(arr);
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
}
