package com.company;

import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;

import java.util.HashMap;

public class LeetCode_MajorityElement {

    public static int majorityElement2(int[] nums) {

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

    public int majorityElement(int[] nums) {

        int candidate=findCandidate(nums);
            if(checkIfMajority(nums,candidate))
                return candidate;
        return 0;
    }

    public static boolean checkIfMajority(int[] nums,int candidate) {
        int length = nums.length;
        int count=0;
        for (int i = 0; i < nums.length; i++)
        {
            if(nums[i]==candidate)
                count++;

            if(count>length/2)
                return true;
        }
        return false;
    }

    public static int findCandidate(int[] arr)
    {
        int count=1;
        int maj_ele_pos= 0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==arr[maj_ele_pos])
                count++;
            else
                count--;

            if (count==0)
            {
                maj_ele_pos=i;
                count=1;
            }
        }
        return arr[maj_ele_pos];
    }


    public static void main(String[] sta)
    {

        int[] arr= {2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }
}
