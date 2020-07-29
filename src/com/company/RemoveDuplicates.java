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

        for(int i =0;i< nums.length;i++)
        {
            if(nums[i]==target)
                return i;
            else if(nums[i]>target)
                return i;
        }
        return -1;
    }

    public static void main(String[] args)
    {

    }
}
