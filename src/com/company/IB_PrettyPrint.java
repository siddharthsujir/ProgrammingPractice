package com.company;

public class IB_PrettyPrint {

    public static void main(String[] args)
    {
        int[][] output=prettyPrint(4);

        for(int i=0;i<output.length;i++)
        {
            for(int j=0;j<output[0].length;j++)
            {
                System.out.print(output[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int[][] prettyPrint(int A) {
        int size=(A*2)-1;
        int[][] output= new int[size][size];
        int level=0;
        int direction=0;
        int top=0,left=0,bottom=size-1,right=size-1;
        int val=A;
        while(level<A)
        {

            if(direction==0)
            {
                for(int i=top;i<=right;i++)
                {
                    output[top][i]=val;
                }
                direction=1;
                top++;
            }
            if(direction==1)
            {
                for(int i=top;i<=bottom;i++)
                {
                    output[i][right]=val;

                }
                right--;
                direction=2;
            }
            if(direction==2) {
                for (int i = right; i >= left; i--)
                {
                    output[bottom][i]=val;
                }
                bottom--;
                direction=3;
            }
            if(direction==3)
            {
                for (int i=bottom;i>=top;i--)
                {
                    output[i][left]=val;
                }
                left++;
                direction=0;
            }
            level++;
            val--;
        }
        return output;
    }
}
