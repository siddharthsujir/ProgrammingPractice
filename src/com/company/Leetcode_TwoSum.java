package com.company;

import java.util.HashMap;

public class Leetcode_TwoSum {

    public static int[] twoSum(int[] nums, int target) {
            int[] output = new int[2];
        HashMap<Integer,Integer> hm= new HashMap<>();
        int diff=0;
            for(int i=0;i<nums.length;i++)
            {
                diff=target-nums[i];
                if(hm.containsKey(diff))
                {
                    output[0]=hm.get(diff);
                    output[1]=i;
                }
                else
                {
                    hm.put(nums[i],i);
                }
            }
            return  output;
    }

    public static void main(String[] args)
    {
        int[] arr= {2,7,11,15};
        int[] output=twoSum(arr,9);

                System.out.println(output[0]+ " "+ output[1]);

    }
}
