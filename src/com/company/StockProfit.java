package com.company;

public class StockProfit {

    public static void main(String[] args)
    {
        int[] arr={10,7,5,8,11,9};
        System.out.println(maxProfit(arr));
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
}
