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
    public static void main(String[] args)
    {
        int[] arr={2,1,4,5};
        findMissingNumbers(arr,6);
    }
}
