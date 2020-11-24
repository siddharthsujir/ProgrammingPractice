package com.company;

public class GK_ContinousSubArraySum {

    public static void findContinousArraySum(int[] arr,int target)
    {
        int sum=0;
        int i=0,j=0,len=arr.length;
        int flag=0;
        while (i<len && j<len)
        {
            sum=sum+arr[j];
            if(checkTarget(sum,target))
            {
                System.out.println("start="+(i+1)+" end="+(j+1));
                flag=1;
                break;
            }

            if(sum<target)
                j++;
            else
            {
                sum=sum-arr[i];
                i++;
                if(checkTarget(sum,target))
                {
                    System.out.println("start="+(i+1)+" end="+(j+1));
                    flag=1;
                    break;
                }


            }

        }

        if(flag==0)
            System.out.println("start="+(-1)+" end="+(-1)); ;
    }

    public static boolean checkTarget(int sum,int target)
    {
        if(sum==target)
        {
           return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        int[] arr={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};//{1,2,3,7,5};
        findContinousArraySum(arr,100);
    }
}
