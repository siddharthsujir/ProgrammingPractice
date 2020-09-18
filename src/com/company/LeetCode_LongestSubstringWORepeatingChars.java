package com.company;

import java.util.HashMap;

public class LeetCode_LongestSubstringWORepeatingChars {

    public static void main(String[] args)
    {
        System.out.println(lengthOfLongestSubstring("dvdf"));
    }

    public static int lengthOfLongestSubstring(String s) {

        if(s.length()==0)
            return 0;

        int i=0;
        int j=i+1;
        int count=1;
        int max=1;
        HashMap<Character,Integer> hm= new HashMap<>();
        hm.put(s.charAt(i),i);
        while (i<s.length()-1 && j<s.length())
        {
            if(!hm.containsKey(s.charAt(j)))
            {
                System.out.println("if "+s.charAt(j));
                count=j-i;
                hm.put(s.charAt(j),j);
                j++;

                if(count>max)
                    max=count;
            }
            else if(hm.get(s.charAt(j))>=i )
            {
                System.out.println("if else "+s.charAt(j));
                count=count-1;
                hm.put(s.charAt(j),j);
                i++;
                //j++;
            }
            else {
                System.out.println("else"+s.charAt(j));
                count++;
                hm.put(s.charAt(j),j);
                j++;

                if(count>max)
                    max=count;
            }


        }

        return max;
    }
}
