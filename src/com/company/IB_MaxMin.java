package com.company;

public class IB_MaxMin {

    public static void main(String[] args)
    {

    }

    public static int solve(int[] A) {

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<A.length;i++)
        {
            max=Math.max(max,A[i]);
            min=Math.min(min,A[i]);
        }

        return max+min;
    }
}
