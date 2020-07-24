package com.company;

public class FindPrime {


    static String primality(int n) {

        if(n==1)
            return "Not prime";
        else if(n==2)
            return "Prime";
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
                return "Not prime";

        }

        return "Prime";

    }


    public static void main(String[] args)
    {

        System.out.println(primality(5));

    }
}
