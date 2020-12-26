package com.company;

public class IB_DecimalToBinary {

    public static void main(String[] args)
    {
        System.out.print(findDigitsInBinary(6));
    }

    public static String findDigitsInBinary(int A) {
        String s="";

        if(A==0)
            return "0";
        while (A>0)
        {
            int a=A%2;
            A=A/2;
            s=a+s;
        }
        return s;
    }
}
