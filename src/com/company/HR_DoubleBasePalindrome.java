package com.company;

public class HR_DoubleBasePalindrome {

    /*
     * Complete the 'getSumOfDoubleBasePalindromes' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER maximum as parameter.
     */

    public static int getSumOfDoubleBasePalindromes(int maximum) {

        int count=0;
        int i=1;
        while(i<=maximum)
        {

            if(isPalindrome(i+""))
            {
                System.out.print("i "+i+" ");
                String binary=binary(i);
                System.out.println(binary);
                if(isPalindrome(binary))
                    count=count+i;
            }
            i++;
        }
        return count;

    }

    public static boolean isPalindrome(String s)
    {
        int i=0,j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
                return false;

            i++;
            j--;
        }
        return true;
    }

    public static String binary(int i)
    {
        String s="";
        while(i>0)
        {
            s=i%2+s;
            i=i/2;
        }
        return s;

    }
}
