package com.company;

public class IB_TrailingZerosInFactorial {

    public static void main(String[] args)
    {
        System.out.println(trailingZeroes(10000));
    }

    public static int trailingZeroes(int A) {

//        long fact=factorial(A);
//        long no=fact;
//        int count=0;
//        while (true)
//        {
//
//            long s=no%10;
//            if(s!=0)
//                return count;
//            else
//                count++;
//
//            no=no/10;
//        }

        int count=0;

        for(int i=5;A/i>0;i=i*5)
        {
            count +=A/i;
        }
        return count;
    }

    public static long factorial(int A)
    {
        int no=A;
        long fact=1;
        while(no>0)
        {
            fact=fact*no;
            //System.out.println(fact);
            no--;
        }

        return fact;
    }
}
