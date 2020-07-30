package com.company;

public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {

        int count=0;
        int len=nums.length;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i+1]==nums[i])
                count++;
        }
        return len-count;
    }

    public int searchInsert(int[] nums, int target) {

        int len=nums.length/2;
        if(target==nums[len-1])
            return len-1;
        if(target<nums[len-1])
        {
            for(int i =0;i< len;i++)
            {
                if(nums[i]==target)
                    return i;
                else if(nums[i]>target)
                    return i;
            }
        }
        else
        {
            for(int i =len;i< nums.length;i++)
            {
                if(nums[i]==target)
                    return i;
                else if(nums[i]>target)
                    return i;
            }

        }


        return nums.length;
    }

    public static void main(String[] args)
    {

    }
}
