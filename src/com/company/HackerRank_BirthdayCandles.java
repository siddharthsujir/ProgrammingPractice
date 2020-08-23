package com.company;

public class HackerRank_BirthdayCandles {

    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {

        int max=Integer.MIN_VALUE;
        int count=0;

        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]>max)
            {
                max=ar[i];
               count=1;
            }
            else if(ar[i]==max)
            {
                count++;
            }

        }
        return count;

    }

    public static void main(String[] args)
    {
        int[] arr={3, 2, 1, 4};
        System.out.println(birthdayCakeCandles(arr));
    }
}
