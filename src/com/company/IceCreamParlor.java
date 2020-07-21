package com.company;

import java.util.HashMap;

public class IceCreamParlor {

    static void whatFlavors(int[] cost, int money) {

        HashMap<Integer,Integer> hm= new HashMap<>();

        for(int i=0;i<cost.length;i++)
        {
            int diff=money-cost[i];
            if(!hm.containsKey(cost[i]))
                hm.put(cost[i],i);

            if(hm.containsKey(diff) && hm.get(diff)!=i)
            {
                System.out.println(hm.get(diff)+1 +" "+(i+1));
                return;
            }

        }

    }
    public static void main(String[] args)
    {
        int[] cost={2, 2, 4, 3};
        whatFlavors(cost,4);

    }
}
