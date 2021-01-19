package com.company;

public class IB_CountSetBit {

    public static void main(String[] args) {
        System.out.println(countSetBit(1));
    }

    public static int countSetBit(int A)
    {
        int i=1;
        int count=0;

        while(i<=A)
        {

            count=count+countBit(i);
            i++;
        }

        int output=count%1000000007;

        return output;
    }

    public static int countBit(int no)
    {
        int count=0;
//        while (no>=1)
//        {
//            if(no%2==1)
//                count++;
//
//            no=no/2;
//        }

        while (no > 0) {
            no &= (no - 1);
            count++;
        }
        return count;
    }
}
