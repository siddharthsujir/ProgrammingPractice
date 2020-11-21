package com.company;

public class ReplaceWithMaximumElement {

    public static void main(String[] args) {
        int[] arr ={1}; //{16, 17, 4, 3, 5, 2};

        arr = replace(arr);

        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }

    }

    public static int[] replace(int[] arr)
    {
        int currentMax=arr[arr.length-1];
        arr[arr.length-1]=-1;
        for(int i=arr.length-2;i>=0;i--)
        {
            if(arr[i]>currentMax)
            {
                int t=arr[i];
                arr[i]=currentMax;
                currentMax=t;

            }
            else
            {
                arr[i]=currentMax;
            }

        }
        return arr;
    }


}
