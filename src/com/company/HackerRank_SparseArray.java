package com.company;

import java.util.HashMap;

public class HackerRank_SparseArray {

    static int[] matchingStrings(String[] strings, String[] queries) {

        HashMap<String,Integer> hm= new HashMap<>();
        int[] output=new int[queries.length];
        int j=0;
        for(int i=0;i<strings.length;i++)
        {
            if(!hm.containsKey(strings[i]))
                hm.put(strings[i],1);
            else
            {
                hm.put(strings[i],hm.get(strings[i])+1);
            }
        }

        for(int i=0;i<queries.length;i++)
        {
            if(hm.containsKey(queries[i]))
                output[j]=hm.get(queries[i]);
            else
                output[j]=0;

            j++;
        }
        return output;
    }
    public static void main(String[] args)
    {

    }
}
