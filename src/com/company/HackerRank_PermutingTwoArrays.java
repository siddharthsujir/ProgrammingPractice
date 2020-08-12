package com.company;

import java.util.HashMap;

public class HackerRank_PermutingTwoArrays {

    // Complete the twoArrays function below.
    static String twoArrays(int k, int[] A, int[] B) {

        HashMap<Integer,Integer> hm= new HashMap<>();

        for(int i=0;i<A.length;i++)
        {
            if(!hm.containsKey(A[i]))
                hm.put(A[i],1);
            else
                hm.put(A[i],hm.get(A[i])+1);
        }

        for(int i=0;i<B.length;i++)
        {
            int diff=k-B[i];
            if(!hm.containsKey(diff) || hm.get(diff)<1)
            {
                return "NO";
            }

            else
            {
                int val=hm.get(diff);
                if(val>0)
                    val=val-1;

                hm.put(diff,val);
            }


        }

        return "YES";
    }
    public static void main(String[] args)
    {
        int[] A= {3,6,8,5,9,9,4,8,4,7};
        int[] B={5,1,0,1,6,4,1,7,4,3};
        System.out.println(twoArrays(9,A,B));
    }
}
