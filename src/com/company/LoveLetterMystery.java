package com.company;

public class LoveLetterMystery {

    // Complete the theLoveLetterMystery function below.
    static int theLoveLetterMystery(String s) {
        int len=s.length();
        int output=0;
        for(int i=0;i<s.length()/2;i++)
        {
            if(s.charAt(i)!=s.charAt(len-1))
            {
                int diff=s.charAt(len-1)-s.charAt(i);
                if(diff>0)
                    output=output+diff;
                else
                    output=output-diff;
            }
            len--;
        }
        return output;
    }


    public static void main(String[] args)
    {
        System.out.println(theLoveLetterMystery("abcd"));
    }
}
