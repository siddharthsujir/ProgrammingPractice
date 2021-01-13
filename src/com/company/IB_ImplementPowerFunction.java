package com.company;

import java.util.HashMap;

public class IB_ImplementPowerFunction {

    public static void main(String[] args)
    {
        System.out.println(powerFunction(71045970,41535484,64735492));
    }

    public static long powerFunction(int x,int n,int d)
    {
        long k= pow2(x,n,d);
        System.out.println("k"+k);
        if(k>=0)
            return k%d;
        else
            return d-k%d;
    }
static HashMap<Integer,Long> hm= new HashMap<>();
    public static long pow2(int x,int n,int d)
    {
        if(hm.containsKey(n))
            return hm.get(n);
        System.out.println("n "+n);
        if(n==1)
        {
            return x%d;
        }

        if(n==0)
        {
            return 1;
        }
        if(n==2)
        {
            return (x%d)*(x%d);
        }
        else
        {
            if(hm.containsKey(n))
                return hm.get(n);
            if(n%2==0)
            {
                long power=pow2(x,(n/2)-1,d)*pow2(x,(n/2)+1,d);
                hm.put(n,power);
                return power;
            }
            else
            {
                long pow=pow2(x,(n/2)-1,d)*pow2(x,(n/2)+1,d)*(x%d);
                hm.put(n,pow);
                return pow;
            }
        }
    }
}
