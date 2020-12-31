package com.company;

public class IB_StepByStep {

    public static void main(String[] args)
    {
        System.out.println(solve2(42));
    }

    public static int solve(int A) {
        int step=1;
        int move=1;
        int val=0;
        val=val+step;
        while(true)
        {
            System.out.println("Val "+val);
            step++;
//            if(val==A)
//                return step;

            int temp=val+step;
            if(temp==A)
                return step;
            if(temp>A)
            {
                System.out.println("greate ");
                val=val-step;
            }
            else if(temp<A)
            {
                System.out.println("lesser ");
                val=val+step;
            }

           // val=val+step;
        }

    }

    public static int solve2(int A)
    {
        int sum=0;
        int step=0;
        if(A<0)
            A=A*-1;
        while(sum<A)
        {
            sum=sum+step;
            step++;
        }

        if (sum==A)
            return step-1;
        else if(sum>A)
        {
            int diff=sum-A;
            if(diff%2==0)
                return step-1;
            else
            {
                sum=sum+step;
                diff=sum-A;
                if (diff%2==0)
                    return step;
                else
                    return step+1;
            }
        }
        return step;
    }
}
