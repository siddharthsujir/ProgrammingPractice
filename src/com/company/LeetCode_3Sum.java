package com.company;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class LeetCode_3Sum {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list =new ArrayList<List<Integer>>();
        //HashMap<Integer,Integer> hm=new HashMap<>();
        int k=0;

        for(int i=0;i<nums.length;i++)
        {
            k=0;
            //int current_sum=0-nums[i];
            HashSet<Integer> hm=new HashSet<>();
            for(int j=i+1;j<nums.length;j++)
            {
                int current_sum=-(nums[i]+nums[j]);
                if(hm.contains(current_sum))
                {
                   List<Integer> row=new ArrayList<>();
                    row.add(nums[i]);
                    row.add(nums[j]);
                    row.add(current_sum);
                    list.add(row);
                    //k++;
                }
                hm.add(nums[j]);
            }
        }

        return list;
    }

    public static List<List<Integer>> threeSumVal(int[] nums, int val) {
        List<List<Integer>> list =new ArrayList<List<Integer>>();
        //HashMap<Integer,Integer> hm=new HashMap<>();
        int k=0;

        for(int i=0;i<nums.length;i++)
        {
            k=0;
            //int current_sum=0-nums[i];
            HashSet<Integer> hm=new HashSet<>();
            int currentSum=val-nums[i];
            for(int j=i+1;j<nums.length;j++)
            {
                int x=currentSum-nums[j];
                if(hm.contains(x))
                {
                    List<Integer> row=new ArrayList<>();
                    row.add(nums[i]);
                    row.add(nums[j]);
                    row.add(x);
                    list.add(row);
                    //k++;
                }
                hm.add(nums[j]);
            }
        }

        return list;
    }

    public static  void main(String[] args)
    {
        int[] nums={-1,0,1,2,-2,4};
        List<List<Integer>> list=threeSumVal(nums,2);
        System.out.println(list.size());
        for (int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i).get(0)+" "+list.get(i).get(1)+" "+list.get(i).get(2));
        }
    }
}
