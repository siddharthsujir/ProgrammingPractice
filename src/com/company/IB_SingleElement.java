package com.company;

public class IB_SingleElement {
    public static void main(String[] args)
    {
        int[] arr={1, 2, 2, 3, 1};
        System.out.println(singeElement(arr));
    }

    public static int singeElement(int[] arr)
    {
        int a=arr[0];

        for(int i=1;i<arr.length;i++)
        {
            a=a^arr[i];
        }
        return a;
    }
}
