package com.company;

public class StockProfit {

    public static void main(String[] args)
    {
        int[] arr={1,2};
        System.out.println(maxProfit2(arr));
    }

    public static int maxProfit(int[] arr)
    {
        int maxProfit=0;

        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                int diff=arr[j]-arr[i];
                if(diff>maxProfit)
                    maxProfit=diff;
            }
        }
        return maxProfit;
    }

    public static int maxProfit2(int[] arr)
    {
        if (arr.length==0)
            return 0;
        int maxProfit=0;
        int maxElement=arr[arr.length-1];

        for(int i=arr.length-2;i>=0;i--)
        {
            if(arr[i]>maxElement)
                maxElement=arr[i];
            else
            {
                int diff=maxElement-arr[i];
                if(diff>maxProfit)
                    maxProfit=diff;
            }
        }
        return maxProfit;
    }
}
