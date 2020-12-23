package com.company;

import java.util.Arrays;

public class IB_NobleInteger {

    public static void main(String[] args)
    {
        int A[]={ -1, -2, 0, 0, 0, -3};
//1 2 3 4
        System.out.print(solve(A));
    }

    public static int solve(int[] A) {


        Arrays.sort(A);

        for(int i=0;i<A.length-1;i++)
        {

            int len=A.length-i-1;
            // System.out.println("len "+len+" a[i] "+A[i]);
            if((A[i]==len || A[i]*-1==len) && A[i+1]!=A[i])
                return 1;

        }

        if(A[A.length-1]==0)
            return 1;

        return -1;
    }
}
