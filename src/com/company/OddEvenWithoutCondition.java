package com.company;

import static com.company.OddEvenWithoutCondition.Type.*;

public class OddEvenWithoutCondition {

    enum Type {
        Even,
        Odd;

         static Type[] allValues = values();

    }

    public static Type isEvenOdd(int n)
    {

       return allValues[n%2];
    }

    public static void main(String[] args)
    {
        System.out.println(isEvenOdd(13));
    }
}
