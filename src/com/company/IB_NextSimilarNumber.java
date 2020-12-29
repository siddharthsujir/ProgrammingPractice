package com.company;

import java.util.Arrays;

public class IB_NextSimilarNumber {

    public static void main(String[] args)
    {
        solve("218765");
    }
//218765
    public static String solve(String A) {
        char[] carr=A.toCharArray();
        int i;
        for( i=A.length()-1;i>0;i--)
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
                if(carr[j]>x && carr[j]<carr[min])
                {
                    min=j;
                }
            }
            carr=swap(carr,i-1,min);

            Arrays.sort(carr,i,carr.length);

            for (i=0;i<carr.length;i++)
                System.out.print(carr[i]);
        }
            return "";
    }

    public static char[] swap(char[] arr,int i,int j)
    {
        char t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;

        return arr;
    }
}
