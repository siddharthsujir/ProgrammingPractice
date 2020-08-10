package com.company;

public class HackerRank_RemoveElement {

    public static int removeElement(int[] nums, int val) {

        int j=0;
        int count=0;
        int i=0;
        while(i<nums.length && j<nums.length)
        {
            if(nums[i]==val)
            {
                nums[i]=nums[j++];
                count=count+1;
            }
            else
            {
                i++;
                if(i==j)
                    j++;
            }
        }
        return count;
    }
    public static void main(String[] args)
    {

    }
}
