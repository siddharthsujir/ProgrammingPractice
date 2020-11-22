package com.company;

import java.util.BitSet;

public class GK_MissingNumber {


    public static void findMissingNumbers(int[] arr,int n)
    {
        int missingCnt=n-arr.length;
        BitSet bs=new BitSet(n);
        for(int i=0;i<arr.length;i++)
        {
            bs.set(arr[i]-1);
        }
        int lastCnt=0;
        for (int j=0;j<missingCnt;++j)
        {
            lastCnt=bs.nextClearBit(lastCnt);
            System.out.println(++lastCnt);
        }

    }


    public static int findMissing2(int[] arr,int n)
    {
        int a =1;

        for(int i=2;i<=n;i++)
        {
            a=a^i;
        }
        int b=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            b=b^arr[i];
        }
        return a^b;
    }

    public static void main(String[] args)
    {
        int[] arr={2,1,4,5};
        //findMissingNumbers(arr,6);

        System.out.println(findMissing2(arr,5));
    }
}
