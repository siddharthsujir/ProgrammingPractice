package com.company;

public class ReverseAarray {

    public static void main(String[] args)
    {
        int[] arrs={1,2,3,4};
        arrs=reverseArray(arrs);

        for(int i=0;i<arrs.length;i++)
        {
            System.out.println(arrs[i]);
        }
    }

    public static int[] reverseArray(int[] arrs)
    {
        if(arrs==null || arrs.length==0)
            return null;
        for(int i=0;i<arrs.length/2;i++)
        {
            int temp=arrs[i];
            arrs[i]=arrs[arrs.length-i-1];
            arrs[arrs.length-i-1]=temp;
        }
        return arrs;
    }
}
