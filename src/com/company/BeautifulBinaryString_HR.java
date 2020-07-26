package com.company;

public class BeautifulBinaryString_HR {

    // Complete the beautifulBinaryString function below.
    static int beautifulBinaryString(String b) {

        String binary_="010";
        int output=0;
        char[] car=b.toCharArray();
        int i=0;
        String temp="";
        while(i<b.length())
        {

            //System.out.println("here "+i);
            temp = temp + b.charAt(i);
            //System.out.println(temp);
            if (temp.contains(binary_))
            {
                output++;
                temp="";
            }
//            else if(temp.length()>=3)
//            {
//                temp="";
//
//            }

                i++;
        }

        return output;
    }

    public static void main(String[] args)
    {
        System.out.println(beautifulBinaryString("0101010"));
    }



}
