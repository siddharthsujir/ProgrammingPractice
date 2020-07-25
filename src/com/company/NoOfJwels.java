package com.company;

import java.util.HashMap;

//LeetCode
public class NoOfJwels {

    public int numJewelsInStones(String J, String S) {

        HashMap<Character,Integer> hm= new HashMap<>();
        int output=0;
        for(int i=0;i<J.length();i++)
        {
            hm.put(J.charAt(i),1);
        }

        for(int i=0;i<S.length();i++)
        {
            if(hm.containsKey(S.charAt(i)))
                output++;
        }
        return output;
    }
}
