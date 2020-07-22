package com.company;

import java.util.HashMap;

public class EqualizeTheArray {

    static int equalizeArray(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int max=1;
        int output=0;
        for(int i=0;i<arr.length;i++)
        {
            if(!hm.containsKey(arr[i]))
                hm.put(arr[i],1);
            else
            {
                hm.put(arr[i],hm.get(arr[i])+1);
                if(max<hm.get(arr[i]))
                    max=hm.get(arr[i]);
            }

        }
        //System.out.println(max);
        if(max==1)
            return arr.length ==1? 0 : arr.length-1;
        else
        return arr.length-max;

    }

    public static void main(String[] args)
    {
        int[] arr={3, 3, 2, 1, 3};//{10, 27, 9, 10, 100, 38, 30, 32, 45, 29, 27, 29, 32,
                //38, 32, 38, 14, 38, 29, 30, 63, 29, 63, 91, 54, 10, 63};
        System.out.println(equalizeArray(arr));
    }

}
