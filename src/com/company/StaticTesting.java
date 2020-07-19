package com.company;

public class StaticTesting {

    static int no=1;
    String name="Sid";
    static {
        System.out.println("Hey this is a static block!");
        no=10;
    }

    StaticTesting()
    {
        System.out.println("This is the Constructor");
    }
    public static void display()
    {
        System.out.println("This is a static method!");

    }

     void nonStaticDisplay()
    {
        System.out.println("Non Static Display!");
        display();
    }
    public static void main(String[] args)
    {
        System.out.println("Number "+no);
        StaticTesting.no=101;

        StaticTesting s=new StaticTesting();
        System.out.println("This is main method!");
        System.out.println("Number "+no);
        s.nonStaticDisplay();
    }
}
