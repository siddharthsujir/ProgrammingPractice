package com.company;

public class IB_SqrtOfNo {

    public static void main(String[] args)
    {
        System.out.println(sqrtOfInt(3));
    }

    public static long sqrtOfInt(int A)
    {
        long start=1;
        long end=A;
        long ans=0;

        if(A==0)
            return 0;
        if(A==1)
            return 1;

        while(start<=end)
        {

          //  System.out.println("Start "+start+" end "+end);
            long mid=(start+end)/2;

            if(mid*mid==A)
                return mid;

            long t=mid*mid;

            if(mid*mid<A)
            {
                start=mid+1;
                ans=mid;
            }
            else
                end=mid-1;
        }
        return ans;
    }
}
