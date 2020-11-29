package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class GK_FirstNonRepeatingCharacterInStrea {

    public static void firstNonRepeatingCharacter()
    {
        String stream="aabc";

        ArrayList<Character> al=new ArrayList<>();
        boolean[] REPEATED_CHAR=new boolean[256];
        String cd=" ";
        for(int i=0;i<stream.length();i++)
        {
            char c=stream.charAt(i);
            if(!REPEATED_CHAR[c])
            {
                REPEATED_CHAR[c]=true;
                    System.out.print(c+" ");
            }
            else
            {
                cd="-1";
                System.out.print("-1 ");
            }



        }
    }
    public static void main(String[] args)
    {
            firstNonRepeatingCharacter();
    }
}
