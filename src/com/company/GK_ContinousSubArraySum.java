package com.company;

public class GK_ContinousSubArraySum {

    public static void findContinousArraySum(int[] arr,int target)
    {
        int sum=0;
        int i=0,j=0,len=arr.length;
        while (i<len && j<len)
        {

            if(sum==target)
            {
                System.out.println("start="+(i+1)+" end="+(j+1));
                break;
            }

            if(sum<target)
                j++;
            else
            {
                sum=sum-arr[i];
                i++;
            }
            sum=sum+arr[j];
        }
    }
    public static void main(String[] args)
    {
        int[] arr={1,2,3,7,5};
        findContinousArraySum(arr,12);
    }
}
