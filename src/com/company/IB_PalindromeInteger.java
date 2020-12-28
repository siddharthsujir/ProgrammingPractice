package com.company;

public class IB_PalindromeInteger {

    public static void main(String[] args)
    {
        System.out.print(isPalindrome(123));
    }

    public static int isPalindrome(int A)
    {
        int no=A;
        int temp=0;
        while(no>0)
        {
            int t=no%10;
            if(temp==0)
                temp=t;
            else
                temp=(temp*10)+t;

            no=no/10;

        }

        if(temp==A)
            return 1;
        else
            return 0;
    }
}
