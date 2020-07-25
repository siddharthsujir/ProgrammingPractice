package com.company;

import java.util.HashMap;

public class LeetCode_RanSomeNote {


    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character,Integer> hm= new HashMap<>();
        for(int i=0;i<magazine.length();i++)
        {
            if(hm.containsKey(magazine.charAt(i)))
                hm.put(magazine.charAt(i),hm.get(magazine.charAt(i))+1);
            else
                hm.put(magazine.charAt(i),1);
        }

        for(int i=0;i<ransomNote.length();i++)
        {
            if(!hm.containsKey(ransomNote.charAt(i)))
                return false;
            else if(hm.get(ransomNote.charAt(i))>0)
                hm.put(ransomNote.charAt(i),hm.get(ransomNote.charAt(i))-1);
            else
                return false;
        }
    }

}