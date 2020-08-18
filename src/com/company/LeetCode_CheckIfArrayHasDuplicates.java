package com.company;

import java.util.HashMap;

public class LeetCode_CheckIfArrayHasDuplicates {

    public static boolean containsDuplicate(int[] nums) {

        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
           if(hm.containsKey(nums[i]))
               return true;
           else
           {
               hm.put(nums[i],1);
           }
        }
        return false;
    }

    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5};
        System.out.println(containsDuplicate(arr));
    }
}
