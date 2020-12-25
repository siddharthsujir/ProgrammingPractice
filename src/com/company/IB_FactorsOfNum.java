package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class IB_FactorsOfNum {

    public static void main(String[] args)
    {
        int[] output=allFactors(6);

        for(int i=0;i<output.length;i++)
        System.out.print(output[i]);
    }

    public static int[] allFactors(int A) {
        ArrayList<Integer> al=new ArrayList<>();
        int k=0;
        for(int i=1;i<=Math.sqrt(A);i++)
        {
            if(A%i==0)
            {
                al.add(i);
                k++;

                if(i!=Math.sqrt(A))
                {
                    al.add(A/i);
                    k++;
                }

            }

        }
        Collections.sort(al);
        int[] output2=new int[k];

        for(int i=0;i<k;i++)
        {
            output2[i]=al.get(i);
        }
        return output2;    }
}
