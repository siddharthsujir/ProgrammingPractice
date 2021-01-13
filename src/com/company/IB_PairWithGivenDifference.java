package com.company;

import java.util.HashMap;

public class IB_PairWithGivenDifference {

    public static void main(String[] args)
    {
        int[] arr={5, 10, 3, 2, 50, 80};
        System.out.println(pairWithDifference(arr,78));
    }

    public static int pairWithDifference(int[] arr,int B)
    {
        HashMap<Integer,Integer> hm= new HashMap<>();

        for(int i=0;i<arr.length;i++)
        {
           if(!hm.containsKey(arr[i]))
           {
               hm.put(arr[i],1);
           }
        }

        for(int i=0;i<arr.length;i++)
        {
            int sum=arr[i]+B ;
            if(hm.containsKey(sum) && hm.get(sum)!=i)
                return 1;
        }
        return 0;


    }


    public static int pairDiffK(int[] A,int B)
    {
        int i=A.length-1;
        int j=0;

        while(i>0)
        {
            while(j<i)
            {
                int diff=A[i]-A[j];

                if(diff==B)
                    return 1;

                j++;
            }
            i++;
        }
        return 0;
    }
}
