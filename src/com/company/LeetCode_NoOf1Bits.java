package com.company;

public class LeetCode_NoOf1Bits {

    public static int hammingWeight(int n) {
        String s=n+"";
        int output=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
                output++;
        }
        return output;
    }

    public static void main(String[] args)
    {
        System.out.println(hammingWeight(00000000000000000000000000001011));
    }
}
