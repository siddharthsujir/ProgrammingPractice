package com.company;

import java.util.EnumMap;

public class EnumMap_Practice {

    public enum EnumPrac
    {
        ODD,
        EVEN;
        static EnumPrac[] allValues=values();
    }
    public static EnumPrac main(String[] args)
    {

        int no=4;
        return EnumPrac.allValues[no%2];
    }
}
