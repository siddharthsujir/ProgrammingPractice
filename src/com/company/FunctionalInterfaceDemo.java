package com.company;

interface RBI
{
    static int minBalance=5000;
    public void deposit();
    public void withdraw();
    public default void linkAadhar()
    {
        System.out.println("Link your Aadhar");
    }
    public default void minBal()
    {
        System.out.println("Min Balance for you account is "+minBalance);
    }
}



class SBI implements  RBI
{
static int sbiMinBalance=4000;
    public void deposit() {
        System.out.println("Inside SBI Deposit");
    }


    public void withdraw() {
        System.out.println("Inside SBI Withdraw");
    }


    public void linkAadhar() {
        System.out.println("Link you Aadhar with SBI!");
    }

    public void minBal() {
        System.out.println("SBI Min balance is "+sbiMinBalance);
    }
}

class HDFC implements RBI
{

    public void deposit() {
        System.out.println("Inside HDFC Deposit");
    }

    public void withdraw() {
        System.out.println("Inside HDFC withdraw");
    }
}

public class FunctionalInterfaceDemo {

    public static void main(String[] args)
    {
        SBI sbi= new SBI();
        sbi.deposit();
        sbi.withdraw();
        sbi.linkAadhar();
        sbi.minBal();

        HDFC hdfc= new HDFC();
        hdfc.deposit();
        hdfc.withdraw();
        hdfc.linkAadhar();
        hdfc.minBal();
    }
}
