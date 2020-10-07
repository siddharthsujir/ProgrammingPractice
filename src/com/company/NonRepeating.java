package com.company;

public class NonRepeating {

    public static int findElementThatOccursOnce(int[] arr) {
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            sum=sum^arr[i];
        }
        return sum;
    }


    public static void find2RepeatingElements(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[Math.abs(arr[i])]>0)
                arr[Math.abs(arr[i])]=-arr[Math.abs(arr[i])];
            else
                System.out.println(Math.abs(arr[i]));
        }
    }
    public static void main(String[] args)
    {
        int[] arr={1,1,2,3,4,4};
        //System.out.println(findElementThatOccursOnce(arr));
        find2RepeatingElements(arr);
    }
}
