package com.company.programming_2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LC_GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> output = new ArrayList<List<String>>();
        HashMap<String, Integer> hm= new HashMap<>();
        int outputIndex = 0;
        for(int i =0; i< strs.length; i++)
        {
            String s = strs[i];
            char[] sa = s.toCharArray();
            Arrays.sort(sa);
            String sortedString = String.valueOf(sa);
            System.out.println(sortedString);
            if(!hm.containsKey(sortedString))
            {
                hm.put(sortedString, outputIndex);
                ArrayList<String> as = new ArrayList<>();
                as.add(s);
                output.add(outputIndex, as);
                outputIndex++;
            }
            else
            {
                int index = hm.get(sortedString);
                output.get(index).add(s);
            }

        }
        return output;
    }

    public  static void main(String[] args)
    {
        String[] str = {"eat","tea","tan","ate","nat","bat"};
        groupAnagrams(str);
    }
}
