package com.company;

public class IB_Stringoholics {

    public static void main(String[] args)
    {
        System.out.println(stringoHolics("a,ababa,aba"));
    }

    public static int stringoHolics(String s)
    {
        char[] c=s.toCharArray();
        String s1="";
        int count=0;
        while (!s1.equals(s))
        {
            count++;
            c=rotateString(c);
            s1=String.valueOf(c);
            System.out.println(s1);
        }

        return count;
    }

    public static char[] rotateString(char[] c){
        char t=c[0];
        for(int i=1;i<c.length;i++)
        {
           c[i-1]=c[i];
        }
        c[c.length-1]=t;
        return c;
    }
}
