package com.company;

import java.util.ArrayList;

public class IB_IntersectionOfSortedArray {

    public static void main(String[] args)
    {

    }

    public static int[] findIntersection(int[] A, int[] B)
    {
        int i=0,j=0;
        ArrayList<Integer> al= new ArrayList<>();
        int len1=A.length,len2=B.length;
        while(i<len1 && j<len2)
        {
            if(A[i]==A[j])
            {
                al.add(A[i]);
                i++;
                j++;
            }
            else if(A[i]<A[j])
            {
                i++;
            }
            else
            {
                j++;
            }
        }

        int[] output=new int[al.size()];
        for(int k=0;k<al.size();k++)
            output[k]=al.get(k);
        return output;
    }
}
