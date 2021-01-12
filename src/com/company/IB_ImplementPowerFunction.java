package com.company;

import java.util.HashMap;

public class IB_ImplementPowerFunction {

    public static void main(String[] args)
    {
        System.out.println(powerFunction(79161127,99046373,64735492));
    }

    public static long powerFunction(int x,int n,int d)
    {
        long k= pow2(x,n);
        System.out.println("k"+k);
        if(k>=0)
            return k%d;
        else
            return d+k;
    }
static HashMap<String,Long> hm= new HashMap<>();
    public static long pow2(int x,int n)
    {
        if(hm.containsKey(x+""+n))
            return hm.get(x+""+n);
        //System.out.println("n "+n);
        if(n==1)
        {
            hm.put(x+""+n,(long)x);
            return x;
        }

        if(n==0)
        {
            hm.put(x+""+n,(long)1);
            return 1;
        }
        if(n==2)
        {
            hm.put(x+""+n,(long)x*x);
            return 1;
        }
        else
        {
            if(hm.containsKey(x+""+n))
                return hm.get(x+""+n);
            if(n%2==0)
            {
                long pow=pow2(x,(n/2)-1)*pow2(x,(n/2)+1);
                hm.put(x+""+n,pow);
                return pow;
            }
            else
            {
                long pow=pow2(x,(n/2)-1)*pow2(x,(n/2)+1)*x;
                hm.put(x+""+n,pow);
                return pow;
            }
        }
    }
}
