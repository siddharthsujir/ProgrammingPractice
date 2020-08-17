package com.company;

public class LeetCode_ReverseInteger {

    public static int reverse(int x) {

        int no=0;
        long newNo=0;
        boolean isNegative=false;
        System.out.println((int)x);
        if(x!=(int)x)
        {

            return 0;
        }

        if(x<0)
        {
            isNegative=true;
            x=x*-1;
        }

        while(x>0)
        {
            int mod=x%10;
            if(newNo==0)
                newNo=mod;
            else
                newNo=(newNo*10)+mod;

            x=x/10;
        }
        try
        {
            if(newNo!= (int)newNo)
                return 0;
            else
            {
                if(isNegative)
                    return (int)newNo*-1;
                else
                    return (int)newNo;
            }
        }
        catch(Exception e)
        {
            return 0;
        }

    }

    public static void main(String[] args)
    {
        //2,147,483,647
        //1,534,236,469
        System.out.println(reverse(1534236469));
    }
}
