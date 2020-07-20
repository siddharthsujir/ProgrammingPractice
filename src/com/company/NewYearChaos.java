package com.company;

public class NewYearChaos {

    static void minimumBribes(int[] q) {
        int bribes=0;
        for(int i=0;i<q.length;i++)
        {
            if(q[i]>i)
            {
                if(q[i]-i>2)
                    System.out.println("Too Chaotic");
                else if(q[i]-i+1==2)
                    bribes=bribes+2;
                else
                    bribes=bribes+1;
            }



        }

    }

// 2 1 5 6 7 3 4
 //   1 2 2 2

    public static void main(String[] args)
    {

    }
}
