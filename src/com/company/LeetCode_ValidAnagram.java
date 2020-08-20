package com.company;

import java.util.HashMap;

public class LeetCode_ValidAnagram {

    public static boolean isAnagram(String s, String t) {

        HashMap<Character,Integer> hm= new HashMap<>();
        if(s.length()!=t.length())
            return false;
        else
        {

            for(int i=0;i<s.length();i++)
            {
                if(!hm.containsKey(s.charAt(i)))
                {
                    hm.put(s.charAt(i),1);
                }
                else
                {
                    hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
                }
            }

            for(int i=0;i<t.length();i++)
            {
                if(!hm.containsKey(t.charAt(i)))
                    return  false;
                else if(hm.get(t.charAt(i))<1)
                    return false;
                else
                {
                    hm.put(t.charAt(i),hm.get(t.charAt(i))-1);
                }
            }
            return true;

        }

    }

    public  static  void main(String[] args)
    {

        System.out.println(isAnagram("anagram","nagaram"));
    }
}
