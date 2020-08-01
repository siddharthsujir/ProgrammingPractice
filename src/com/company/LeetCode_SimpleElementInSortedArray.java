package com.company;

public class LeetCode_SimpleElementInSortedArray {

    public static int singleNonDuplicate(int[] nums) {

        int len=nums.length;
        if(nums.length==1)
            return nums[0];
        else if(nums.length==2 && nums[0]!=nums[1])
            return nums[0];
        else
        {
            for(int i=0;i<len;i++)
            {

                if(i==0 && nums[i]!=nums[i+1])
                {
                    return  nums[i];
                }
                else if(i==len-1 && nums[i]!=nums[i-1])
                {
                    return nums[i];
                }
                else
                {
                    if(nums[i]!=nums[i+1] && nums[i]!=nums[i-1])
                    {
                        return nums[i];
                    }
                }

            }

        }
        return -1;

    }
    

    public static void main(String[] args)
    {
        int[] arr={1,1,2};
        System.out.println(singleNonDuplicate(arr));
    }
}
