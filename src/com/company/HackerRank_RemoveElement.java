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
                {
                    count++;
                    j++;
                }

                else
                {
                    nums[i]=nums[j];
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

        return nums.length-count;

    }
    public static void main(String[] args)
    {
        int[] arr={3,2,2,3};
        System.out.println(removeElement(arr,3));
    }
}
