package com.company;

public class LeetCode_ArrangingCoins {

    public static int arrangeCoins(int n) {

        long i=0;
        int prev=0;
        int current=0;
        int stairs=0;
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        while(i<=n)
        {

            prev=prev+1;
            i=i+prev;
            if(i<=n)
                stairs++;
        }
        return stairs;
    }

    public static void main(String[] args)
    {
        System.out.println(arrangeCoins(2147483647));

    }
}
