package com.company;

import java.util.HashMap;

public class MakingAnagram {

    static int makeAnagram(String a, String b) {

        HashMap<Character, Integer> hm = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();

        int diff=0;//Math.abs(a.length()-b.length());


        for (int i = 0; i < a.length(); i++)
        {
            if(hm.containsKey(a.charAt(i)))
                hm.put(a.charAt(i),hm.get(a.charAt(i))+1);
            else
                hm.put(a.charAt(i),1);
        }

        for(int i=0;i < b.length();i++)
        {
            if(!hm.containsKey(b.charAt(i)) )
            {
                diff++;


            }

            else if( hm.get(b.charAt(i))<=0)
            {
                diff++;
                hm.put(b.charAt(i),hm.get(b.charAt(i))-1);
            }

            else
            {
                if(hm2.containsKey(b.charAt(i)))
                    hm2.put(b.charAt(i),hm2.get(b.charAt(i))+1);
                else
                    hm2.put(b.charAt(i),1);
            }

        }

        for (int i = 0; i < a.length(); i++)
        {
            if(!hm2.containsKey(a.charAt(i)) )
            {
                diff++;
            }

            else if( hm2.get(a.charAt(i))<=0)
            {
                diff++;
                hm2.put(a.charAt(i),hm2.get(a.charAt(i))-1);
            }

        }
        return diff;

    }
    // abc
    //aab
    public static  void main(String[] args)
    {
        System.out.println(makeAnagram("cde","abc"));
    }
}
