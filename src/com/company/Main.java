package com.company;

public class Main {

    public static void main(String[] args) {
	// write  code here
        System.out.println(findFactorial(4));
    }

    public static int findFactorial(int n)
    {
        return factorial(n);
    }

    public static int factorial(int n)
    {
        if(n==0){
            return 1;
        }
        else if(n==1)
            return 1;
        else
          return   n*factorial(n-1);
    }
}
