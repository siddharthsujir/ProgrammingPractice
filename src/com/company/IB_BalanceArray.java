package com.company;

public class IB_BalanceArray {

    public static void main(String[] args)
    {
        int[] arr={5, 5, 2, 5, 8};

        //leftOdd {0,5,7}
        //leftEven {0,2}
        // rightOdd {6,0}
        //rightEven {4,0}
        System.out.println(balanceArray(arr));
    }

    public static int balanceArray(int[] A)
    {
        int[] leftOdd=new int[A.length];
        int[] leftEven= new int[A.length];
        int[] rightOdd= new int[A.length];
        int[] rightEven= new int[A.length];
        int output=0;

        for(int i=2;i<A.length;i++)
        {
            int oddSum=0;
            int evenSum=0;
            if(i%2!=0)
            {
                oddSum=oddSum+A[i-2];
                leftOdd[i]=oddSum;
            }
            else if(i%2==0)
            {
                evenSum=evenSum+A[i-2];
                leftEven[i]=evenSum;
            }
        }

        for(int i=A.length-3;i>0;i--)
        {
            int oddSum=0;
            int evenSum=0;

            if(i%2==0)
            {
                evenSum=evenSum+A[i+2];
                rightEven[i]=evenSum;
            }
            else
            {
                oddSum=oddSum+A[i+2];
                rightOdd[i]=oddSum;
            }

        }

        for(int i=0;i<A.length;i++)
        {
            if(leftOdd[i]+rightEven[i]==leftEven[i]+rightOdd[i])
            {
                output++;

            }

        }
        return output;
    }
}
