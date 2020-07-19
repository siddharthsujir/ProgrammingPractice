package com.company;



public class StringDemo {


    public static void main(String[] args)
    {
        String s1= new String("Java");
        String s2= new String("Java");

        System.out.println(s1==s2);

        System.out.println(s1.hashCode() +" "+s2.hashCode());
        String s3="Java";
        String s4="java";
        System.out.println(s3==s4);

        String s5= s3.toLowerCase();
        System.out.println(s5.hashCode() + " "+s4.hashCode());

        Boolean b=new Boolean("true");


        StringBuffer sb=new StringBuffer("abs");
        StringBuffer sb2=new StringBuffer("abs");
        System.out.println(sb.hashCode() + " "+ sb2.hashCode());
        sb.append("bns");
        System.out.println(sb.hashCode() + " "+ sb2.hashCode());
    }
}
