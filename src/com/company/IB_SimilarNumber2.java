package com.company;

import java.util.Arrays;

public class IB_SimilarNumber2 {

    public static void main(String[] args)
    {
        System.out.println(findSimilar("218765"));
    }

    public static String findSimilar(String s)
    {
        char[] carr=s.toCharArray();
        String output="";
        int i;
        for( i=carr.length-1;i>0;i--)
        {
            if(carr[i]>carr[i-1])
                break;
        }

        if(i==0)
            return "-1";
        else
        {
            int x=carr[i-1];
            int min=i;

            for(int j=i+1;j<carr.length;j++)
            {
                if(carr[i]>x && carr[j]<carr[min])
                {
                    min=j;
                }
            }
            carr=swap(carr,i-1,min);

            Arrays.sort(carr,i,carr.length);

            for(int k=0;k<carr.length;k++)
               output=output+carr[k];

            return output;
        }
    }

    public static char[] swap(char[] carr,int i,int j)
    {
        char temp=carr[i];
        carr[i]=carr[j];
        carr[j]=temp;
        return carr;
    }
}
