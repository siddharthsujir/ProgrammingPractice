package com.company;

import java.util.HashMap;

public class GK_CountTriplets {

    public static int countTriplets(int[] arr)
    {
        HashMap<Integer,Integer> hm= new HashMap<>();

        for(int i=0;i<arr.length;i++)
        {
            if(!hm.containsKey(arr[i]))
                hm.put(arr[i],1);
            else
            {
                hm.put(arr[i],hm.get(arr[i])+1);
            }
        }
        int count=0;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=1;j<arr.length;j++)
            {
                int sum=arr[i]+arr[j];
                if(hm.containsKey(sum))
                    count++;
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        int[] arr={2, 3, 4};//{1, 5, 3, 2};
        System.out.println(countTriplets(arr));
    }
}
