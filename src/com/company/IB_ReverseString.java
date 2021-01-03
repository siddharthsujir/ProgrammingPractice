package com.company;

public class IB_ReverseString {

    public static void main(String[] args)
    {
        System.out.println(reverseString("x tb i f chfpzf"));//"x tb i f chfpzf"));
    }

    public static String reverseString(String s)
    {
        String output="";
        int j=s.length()-1;
        if(s.length()==1)
            return s;

        while(j>=0)
        {
//            if(j==0)
//            {
//                output=output+s.charAt(j);
//                break;
//            }
            System.out.println(j);
            if(s.charAt(j)==' ')
            {
                j--;
                continue;
            }


            int i=j;


            while(i>0 && s.charAt(i)!=' ' )
            {
                i--;
            }

             if(i>=0)
                output=output+s.substring(i,j+1).trim()+" ";
//             else
//                 output=output+s.charAt(i+1)+"";



            j=i-1;

        }

        return output.trim();
    }
}
