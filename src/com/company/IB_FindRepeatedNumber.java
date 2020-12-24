package com.company;

import java.util.HashMap;

public class IB_FindRepeatedNumber {

    public static int[] repeatedNumber(final int[] A) {


        int[] output={0,0};
        output[1]=firstMissingPositive(A);
//        for(int i=0;i<A.length;i++)
//        {
//            int index=-1;
//            index=A[i]%A.length;
//            A[index]+=A.length;
//        }
//
//        for(int i=0;i<A.length;i++)
//        {
//            if(A[i]%A.length>2)
//                output[0]=A[i];
//        }

        HashMap<Integer,Integer> hm= new HashMap<Integer,Integer>();

        for(int i=0;i<A.length;i++)
        {
            if(!hm.containsKey(A[i]))
                hm.put(A[i],1);
            else
            {
                output[0]=A[i];
                break;
            }

        }



        return output;

    }

    public static int firstMissingPositive(int[] A) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int max=0;
        for (int i = 0; i < A.length; i++)
        {
           // System.out.println(A[i]);
            max=Math.max(A[i],max);
            if(A[i]>0)
            {
                if(!hm.containsKey(A[i]))
                    hm.put(A[i],1);
            }
        }
        //System.out.print("Max "+max+" ");
        for(int i=1;i<=max;i++)
        {
            if(!hm.containsKey(i))
                return i;
        }
        return max+1;
    }

    public static void main(String[] args)
    {

        int[] arr={3,1,2,5,3};
        int[] output=repeatedNumber(arr);
        for(int i=0;i<output.length;i++)
            System.out.print(output[i]+ " ");
    }
}
