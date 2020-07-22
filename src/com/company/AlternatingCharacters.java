package com.company;

public class AlternatingCharacters {

    // Complete the alternatingCharacters function below.
    static int alternatingCharacters(String s) {
        int deletions=0;

        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
                deletions++;
        }
        return deletions;
    }


    public static void main(String[] args)
    {
        System.out.println(alternatingCharacters("AAABBB"));

    }
}
