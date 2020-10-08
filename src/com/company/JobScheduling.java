package com.company;

import java.util.Arrays;

public class JobScheduling {


    public static void main(String[] args)
    {
        int[][] jobs={{2,20},{3,12},{13,16},{7,18}};
        System.out.println(getMinimumNoOfMachine(jobs));

    }

    public static int getMinimumNoOfMachine(int[][] args)
    {
        int[] startTime=new int[args.length];
        int[] endTime=new int[args.length];
        int no=1;

        for(int i=0;i<args.length;i++)
        {
            startTime[i]=args[i][0];
            endTime[i]=args[i][1];
        }

        Arrays.sort(startTime);
        Arrays.sort(endTime);

        for(int i=1;i<startTime.length;i++)
        {
            for(int j=0;j<endTime.length;j++)
            {
                if(startTime[i]>endTime[j])
                {
                    no--;
                    break;
                }
                else
                {
                    break;
                }
            }
            no++;
        }
        return no;
    }

}
