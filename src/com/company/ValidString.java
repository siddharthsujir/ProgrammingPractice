package com.company;

import java.util.HashMap;

public class ValidString {

    // Complete the isValid function below.
    static String isValid(String s) {

        HashMap<Character,Integer> hm= new HashMap<>();
        int prev=0;
        int totaldiff=0;

        for(int i=0;i<s.length();i++)
        {
            if(!hm.containsKey(s.charAt(i)))
                hm.put(s.charAt(i),1);
            else
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);

        }

        for(int i =0 ;i<s.length();i++)
        {
            if(prev==0)
                prev=hm.get(s.charAt(i));
            else
            {
                int val=hm.get(s.charAt(i));
                int diff = Math.abs(prev-val);
                System.out.println(totaldiff+ " "+ diff);

                totaldiff=totaldiff+diff;
                if(diff>1 || totaldiff>1)
                    return "NO";


            }
        }
        return "YES";

    }

    public static void main(String[] args)
    {
        System.out.println(isValid("abcdefghhgfedecba"));
    }
}
