package com.company;

public class IB_PowerOfTwoIntegers {

    public static void main(String[] args) {

    }

    public int isPower(int A) {

        if (A == 1 || A == 0)
            return 1;
        for (int i = 2; i <= Math.sqrt(A); i++) {
            int y = 2;
            double p = Math.pow(i, y);
            while (p <= A && p > 0) {
                if (p == A)
                    return 1;
                y++;
                p = Math.pow(i, y);
            }
        }
        return 0;

    }
}