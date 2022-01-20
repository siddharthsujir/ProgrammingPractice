package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HackerRank_PerfectSubString {

    // Count perfect
    // Substring where frequency of chars in substring == k
    /*
     * Complete the 'perfectSubstring' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static int perfectSubstring(String s, int k) {
        // Write your code here

        int count=0;

        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<=s.length();j++)
            {
                String sub=s.substring(i,j);
                //System.out.println("substring "+ sub);
                if(isperfect(sub, k))
                    count++;
            }
        }
        return count;
    }

    public static boolean isperfect(String s,int k)
    {
        HashMap<Character,Integer> hm= new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(!hm.containsKey(s.charAt(i)))
                hm.put(s.charAt(i), 1);
            else
                hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
        }
        Set<Character> set=hm.keySet();
        Iterator<Character> iterate=set.iterator();

        while(iterate.hasNext())
        {
            Character c= iterate.next();
            if(hm.get(c)!=k)
                return false;
        }
        // for(int i=0;i<s.length();i++)
        // {
        //     Character c= s.charAt(i);
        //     if(hm.get(c)!=k)
        //     {
        //        // System.out.print("frequecy of "+c+" "+hm.get(c));
        //         return false;
        //     }

        // }

        return true;

    }

}
