package com.company;

public class IB_IsPrime {

    public int isPrime(int A) {

        if(A==1 )
            return 0;
        if( A==2)
            return 1;

        for(int i=2;i<=Math.sqrt(A);i++)
        {
            if(A%i==0)
                return 0;
        }

        return 1;
    }
}
