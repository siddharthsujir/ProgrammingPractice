package com.company;


import java.util.HashMap;

public class Pair {
    // Complete the pairs function below.
    static int pairs(int k, int[] arr) {

        HashMap<Integer,Integer> hm = new HashMap<>();
        int output=0;
        for(int i=0;i<arr.length;i++)
        {
            if(!hm.containsKey(arr[i]))
                hm.put(arr[i],arr[i]);

        }

        for(int i=0;i<arr.length;i++)
        {
            if(hm.containsKey(arr[i]+k))
                    output++;
        }
        return output;

    }

    public static void main(String[] args)
    {
        int[] arr={1, 2, 3, 4};
        System.out.println(pairs(1,arr));
    }
}
