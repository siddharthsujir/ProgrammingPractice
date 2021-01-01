package com.company;

public class IB_SqrtOfNo {

    public static void main(String[] args)
    {
        System.out.println(sqrt(2147483647));
    }

    public static long sqrt(int A) {

        int i=1;
        double res=0;

        if(A>100000)
            i=i*100000;
        if(A>1000000)
            i=i*10;
        else if(A>10000000)
            i=i*10;
        else if(A>100000000)
            i=i*10;
        int mid=A/2;
        int s=0;




        while(true)
        {
         // .  System.out.println("i"+i);
            if(i*i==A)
            {

                return i*i;
            }
            else if(i*i>A)
            {
                res=square(A,i-1,i);
                return Math.round(Math.floor(res));
            }


            i++;
        }


    }

    public static double square(int A,double i,double j)
    {
       // System.out.println("i "+i+" j"+j);
        double mid=(i+j)/2;
        double mul=mid*mid;

        if(mul==A || Math.abs(mul-A)<0.00001)
            return mid;

        else if(mul<A)
            return square(A,mid,j);

        else
            return square(A,i,mid);


    }
}
