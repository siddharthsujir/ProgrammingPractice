package com.company;

public class HackerRank_RemoveElement {

    public static int removeElement(int[] nums, int val) {

        int i=0,j=0,count=0;

        if(nums.length==0)
            return 0;
        if(nums.length==1)
        {
            if(nums[0]==val)
                return 0;
        }

        while(i<nums.length && j<nums.length)
        {

            if(nums[i]==val)
            {
                if(nums[j]==val)
                    j++;
                else
                {
                    nums[i]=nums[j];
                    count++;
                    i++;
                    j++;
                }

            }
            else
            {
                nums[i]=nums[j];
                i++;
                j++;
            }

        }

//        for(int k=0;k<nums.length;k++)
//        {
//            System.out.print(nums[k]+" ");
//        }
        if(i>0 && i==nums.length && nums[i-1]==val)
            count=count+1;
        return nums.length-count;

    }
    public static void main(String[] args)
    {
        int[] arr={3,3};
        System.out.println(removeElement(arr,3));
    }
}
