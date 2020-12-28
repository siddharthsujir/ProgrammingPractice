package com.company;

public class IB_ReverseInteger {

    public int reverse(int A) {

        int flag=0;

        int no=A;
        if(A<0)
        {

            flag=1;
            no=no*-1;
        }


        int temp=0;
        while(no>0)
        {
            int t=no%10;
            if(temp==0)
                temp=t;
            else
            {
                long t2=((long)temp*10)+(long)t;
                if(t2>Integer.MAX_VALUE)
                {
                    return 0;
                }

                temp=(temp*10)+t;
            }


            no=no/10;

        }

        if(flag==1)
            temp=temp*-1;

        return temp;
    }
}
