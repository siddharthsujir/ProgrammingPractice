package com.company;

public class IB_TrailingZero {

    public static void main(String[] args)
    {
        System.out.println(countZeros(1));
    }

    public static int countZeros(int A)
    {
        int oneEncountered=0;
        int count=0;
        while(A>1)
        {
            int no=A%2;
            if(no==1)
                return count;
            else
                count++;

            A=A/2;
        }
        return count;
    }
}
