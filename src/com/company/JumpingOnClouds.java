package com.company;

public class JumpingOnClouds {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int jumps=0;
            for(int i=0;i<c.length-1;)
            {
                if(i+2<=c.length-1 && c[i+2]==0)
                {
                    jumps++;
                    i=i+2;
                }
                else if(c[i+1]==0)
                {
                    jumps++;
                    i++;
                }
            }
        return jumps;
    }

    public static void main(String[] args)
    {
        int[] array={0, 0, 1, 0, 0, 1, 0};//{0, 0, 0, 0, 1, 0};
        System.out.println(jumpingOnClouds(array));
    }
}
