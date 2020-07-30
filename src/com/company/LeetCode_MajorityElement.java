package com.company;

import java.util.HashMap;

public class LeetCode_MajorityElement {

    public static int majorityElement(int[] nums) {

        HashMap<Integer,Integer> hm= new HashMap<>();
        long middle= (long)Math.floor(nums.length/2);

        if(nums.length==1)
            return nums[0];

        for(int i=0;i<nums.length;i++)
        {
            if(!hm.containsKey(nums[i]))
            {
                hm.put(nums[i],1);
            }

            else
            {
                int val=hm.get(nums[i]);
                hm.put(nums[i],val+1);
                if(val+1>middle)
                    return nums[i];
            }
        }
        return 0;

    }

    public static void main(String[] sta)
    {

        int[] arr= {2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }
}
