package com.company;

abstract class Abstractclass {
    int no;

    Abstractclass()
    {
        System.out.println("Abstract Class Constructor");
        this.no=10;
    }
    public void getInfo()
    {
        System.out.println("This is an Abstract class Method");
    }

    public abstract void displayAbstract();
}

interface NewInterface
{

    public void displayInterface();
    public void showInterdace();
}

public class AbstractInterface extends Abstractclass {


    public void displayAbstract()
    {
        System.out.println("Display Implementation!");
    }

    public static void main(String[] args)
    {
        AbstractInterface ai=new AbstractInterface();
        ai.displayAbstract();
        ai.getInfo();
        System.out.println(ai.no);
    }
}
