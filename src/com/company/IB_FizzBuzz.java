package com.company;

public class IB_FizzBuzz {

    public String[] fizzBuzz(int A) {

        String[] output=new String[A];

        for(int i=1;i<=A;i++)
        {
            if(i%5==0 && i%3==0)
                output[i-1]="FizzBuzz";
            else if(i%3==0)
                output[i-1]="Fizz";
            else if(i%5==0)
                output[i-1]="Buzz";
            else
                output[i-1]=i+"";
        }

        return output;
    }
}
