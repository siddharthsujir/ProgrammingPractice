package com.company;

import java.util.HashMap;

public class LeetCode_ClimbingSteps {

    static HashMap<Integer,Integer> hm=new HashMap<>();
    public static int climbStairs(int n) {

        if(n==0 || n==1)
            return 1;
        else if(hm.containsKey(n))
            return hm.get(n);
        else
        {
            hm.put(n,climbStairs(n-1)+climbStairs(n-2));
            return hm.get(n);
        }

    }
    public static void main(String[] args)
    {

        System.out.println(climbStairs(3));
    }
}
