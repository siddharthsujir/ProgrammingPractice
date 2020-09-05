package com.company;

public class LeetCode_MissingNumber {

    public static int missingNumber(int[] nums) {
        int max = -1;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int arrSum = 0;
        if (nums.length == 1)
        {
            if(nums[0]==0)
                return 1;
            else if(nums[0]==1)
                return 0;

        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max)
                max=nums[i];
            if(nums[i]<min)
                min=nums[i];

            arrSum=arrSum+nums[i];
        }

        if(min!=0)
            return 0;

        for(int i=0;i<=max;i++)
        {
            sum=sum+i;
        }


        return sum-arrSum;


    }

    public static void main(String[] args)
    {

        int[] arr={3,0,1};
        System.out.println(missingNumber(arr));
    }
}
