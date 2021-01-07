package com.company;

import java.util.HashMap;

public class IB_NthFibonacci {

    public static void main(String[] args)
    {
        System.out.println(nthFibonacci(50));
    }

    public static long nthFibonacci(int n)
    {
        return fibonacci(n);
    }
    static HashMap<Integer,Long> hm= new HashMap<>();
    public static int fibonacci(int N)
    {

        long[] d=new long[N+2];

        d[0]=0;
        d[1]=1;

        for(int i=2;i<=N;i++)
        {
            d[i]=d[i-1]+d[i-2];
        }

        double op=d[N]%(Math.pow(10,9)+7);
        return (int)op;
    }
}
