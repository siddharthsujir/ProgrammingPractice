package com.company;

public class Leetcode_IncreasingTripletSubsequence {

    public static boolean checkIfTripletSubsequenceExists(int[] arr)
    {
        int j=1;
        boolean flag=false;
        int count=0;
        for(int i=0;i<arr.length && j<arr.length;)
        {

            if(arr[i]>arr[j])
            {
                i++;
                j++;
                count=1;
            }
            else if(arr[i]<arr[j])
            {
                j++;
                System.out.println("here "+j+ " "+i);
                count++;
            }

            if(count==3 && i!=j)
                return true;
        }
        return flag;
    }

    public static void main(String[] args)
    {
        int[] arr={2,1,5,0,4,6};
        System.out.println(checkIfTripletSubsequenceExists(arr));
    }
}
