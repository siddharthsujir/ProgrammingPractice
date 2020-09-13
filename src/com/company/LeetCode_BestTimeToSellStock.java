package com.company;

public class LeetCode_BestTimeToSellStock {

    public static void main(String[] args)
    {
        int[] arr={2,1,2,1,0,1,2};
        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int[] prices) {
            int maxPrice = 0;
            maxPrice = findMaxPrice(prices);
            int minPrice=findMinPrice(prices);
            //System.out.println(maxPrice);
            int maxProfit=0;
            for (int i = 0; i <= maxPrice; i++)
            {
                int profit=prices[maxPrice]-prices[i];
                if(profit>maxProfit)
                    maxProfit=profit;
            }

            for(int i=minPrice;i<prices.length;i++)
            {
                int profit=prices[i]-prices[minPrice];
                if(profit>maxProfit)
                    maxProfit=profit;
            }


            return maxProfit;
    }

    public static int findMaxPrice(int[] prices)
    {
        int max=-1;
        int maxValue=0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]>=maxValue)
            {
                maxValue=prices[i];
                max=i;
            }

        }
        return max;
    }
    public static int findMinPrice(int[] prices)
    {
        int min=0;
        int minValue=Integer.MAX_VALUE;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]<=minValue)
            {
                minValue=prices[i];
                min=i;
            }

        }
        return min;
    }


}
