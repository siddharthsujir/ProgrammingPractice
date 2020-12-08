package com.company;

public class GK_CheckIfStringRotatedTwoPlaced {

    public static void main(String[] args)
    {
        System.out.println(checkIfRotatedTwoPlaces("geeksforgeeks","geeksgeeksfor"));
    }

    public static boolean checkIfRotatedTwoPlaces(String s1,String s2)
    {

        //System.out.println(rotateString(s1,2));
        if(rotateString(s1,2).equals(s2))
            return true;
        else
            return false;

    }

    //amazon
    public static String rotateString(String s1,int k)
    {
        char[] carr=s1.toCharArray();
        while(k>0)
        {

            char c=carr[0];
            for(int i=1;i<carr.length;i++)
            {
                carr[i-1]=carr[i];
            }
            carr[carr.length-1]=c;

            k--;
        }
        return new String(carr);
    }
}
