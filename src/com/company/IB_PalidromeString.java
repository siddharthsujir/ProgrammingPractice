package com.company;

public class IB_PalidromeString {
    public static void main(String[] args)
    {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
    public static int isPalindrome(String A) {
        String Alwr=A.toLowerCase();
        int i=0,j=A.length()-1;

        while(i<j)
        {
           // System.out.println("i "+A.charAt(i)+" j "+A.charAt(j));
            if(Alwr.charAt(i)<97 || Alwr.charAt(i)>122 )
            {
                if(Alwr.charAt(i)<48 || Alwr.charAt(i)>57 )
                {
                    i++;
                    continue;
                }

            }


            if(Alwr.charAt(j)<97 || Alwr.charAt(j)>122)
            {
                if(Alwr.charAt(i)<48 || Alwr.charAt(i)>57 ) {
                    j--;
                    continue;
                }
            }


            if(Alwr.charAt(i)!=Alwr.charAt(j))
            {

                return 0;
            }
            i++;
            j--;
        }
        return 1;

    }
}
