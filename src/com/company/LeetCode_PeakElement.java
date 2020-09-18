package com.company;

public class LeetCode_PeakElement {
    public static int findPeakElement(int[] nums) {

        if (nums.length==1)
            return 0;
        for(int i=0;i<nums.length-1;i++) {
            if (i == 0 )
            {
                if(nums[i] > nums[i + 1])
                    return i;
            }
            else {
                if(nums[i]>nums[i-1] && nums[i]>nums[i+1])
                    return i;
            }

        }

        if(nums[nums.length-1]>nums[nums.length-2])
            return nums.length-1;

        return -1;
    }

    public static void main(String[] args)
    {
        int[] arr={1};
        System.out.println(findPeakElement(arr));
    }
}
