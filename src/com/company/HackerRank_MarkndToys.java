package com.company;

import java.util.Arrays;

public class HackerRank_MarkndToys {

    // Complete the maximumToys function below.
    static int maximumToys(int[] prices, int k) {

        Arrays.sort(prices);
        int sum=0;
        if(sum>=k)
            return 0;
        for(int i=0;i<prices.length;i++)
        {
         sum=sum+prices[i];
         if(sum>=k)
             return i;
        }
        return -1;

    }

    public static void main(String[] args)
    {

        int[] arr={1, 12, 5, 111, 200, 1000, 10};
        System.out.println(maximumToys(arr,50));
    }
}
