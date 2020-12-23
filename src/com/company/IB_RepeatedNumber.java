package com.company;

import java.util.HashMap;

public class IB_RepeatedNumber {

    public static void main(String[] args)
    {
        int[] arr={1,2,1,2,3,4,5};
        System.out.println(repeatedNo2(arr));
    }

    public static int repeatedNumber(final int[] A) {

        HashMap<Integer,Integer> hm= new HashMap<>();


        for(int i=0;i<A.length;i++)
        {
                if(hm.containsKey(A[i]))
                    return A[i];
                else
                {
                    hm.put(A[i],1);
                }
        }
        return -1;
    }


    public static int repeatedNo2(int[] A)
    {
        int n=A.length;

        for(int i=0;i<n;i++)
        {
            int index=-1;
            index=A[i]%n;
            A[index]+=n;
        }

        for(int i=0;i<n;i++)
        {
            if((A[i]/n)>=2)
                return i;
        }
        return -1;
    }

}

