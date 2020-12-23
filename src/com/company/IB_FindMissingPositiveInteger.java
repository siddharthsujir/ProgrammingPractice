package com.company;

import java.util.HashMap;

public class IB_FindMissingPositiveInteger {

    public static void main(String[] args)
    {
        int[] arr={1};
        System.out.print(firstMissingPositive(arr));
    }
    public static int firstMissingPositive(int[] A) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int max=0;
        for (int i = 0; i < A.length; i++)
        {
            max=Math.max(A[i],max);
            if(A[i]>0)
            {
                if(!hm.containsKey(A[i]))
                    hm.put(A[i],1);
            }
        }
        System.out.print("Max "+max);
        for(int i=1;i<=max;i++)
        {
            if(!hm.containsKey(i))
                return i;
        }
        return max+1;
    }
}
