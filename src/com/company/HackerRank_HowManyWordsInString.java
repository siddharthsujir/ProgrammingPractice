package com.company;

public class HackerRank_HowManyWordsInString {

    /*
     * Complete the 'howMany' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING sentence as parameter.
     */

    public static int howMany(String sentence) {
        // Write your code here
        sentence=sentence.trim();
        int count=0;
        String[] splitString=sentence.split("\\s+");

        for(int i=0;i<splitString.length;i++)
        {
            boolean isDigit=isDigit(splitString[i]) || !isValidString(splitString[i]);
            //System.out.println("String "+splitString[i]+" is digit "+isDigit+" count "+count+ " is valid string"+ isValidString(splitString[i]));
            if(!isDigit)
                count++;
        }

        return count;

    }

    public static boolean isDigit(String s)
    {
        boolean isDigit=true;
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>=48 && s.charAt(i)<=57)
                count++;
        }
        if(count>0)
            isDigit=true;
        else
            isDigit=false;

        return isDigit;

    }

    public static boolean isValidString(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            Character c=s.charAt(i);
            if(c=='(' ||c==')' ||c=='[' ||c==']' || c=='{' ||c=='}')
                return false;


        }
        return true;
    }
}
