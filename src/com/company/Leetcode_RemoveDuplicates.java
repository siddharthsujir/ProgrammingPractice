package com.company;

public class Leetcode_RemoveDuplicates {

    public static void main(String[] args)
    {
        int[] arr={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
    }
   public static int removeDuplicates(int[] arr)
    {
        int count=1;
        int k=2;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]!=arr[i-1])
                count++;
        }

        for(int i=1;i<arr.length && k< arr.length;)
        {
            if(arr[i]==arr[i-1] || arr[i]<arr[i-1])
            {

                arr[i]=arr[k];
                k++;
            }
            else
            {

                    i++;

            }
        }
        return count;
    }
}
