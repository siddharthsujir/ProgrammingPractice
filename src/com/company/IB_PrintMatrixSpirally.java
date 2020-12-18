package com.company;

public class IB_PrintMatrixSpirally {

    public static void main(String[] args)
    {
        int[][] A={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[] output=spiralOrder(A);

        for(int i=0;i<output.length;i++)
        {
            System.out.print(output[i]+" ");
        }

    }

    public static int[] spiralOrder(final int[][] A) {

        int n=A.length;
        int m=A[0].length;
        int[] output= new int[n*m];
        int T=0,B=n-1,L=0,R=m-1;
        int dir=0;
        int k=0;

        while(T<=B && L<=R)
        {
            if(dir==0)
            {
                for(int i=L;i<=R;i++)
                {
                    output[k]=A[T][i];
                    k++;
                }
                T++;
                dir=1;
            }
            else if(dir==1)
            {
                for(int i=T;i<=B;i++)
                {
                    output[k]=A[i][R];
                    k++;
                }
                R--;
                dir=2;
            }
            else if(dir==2)
            {
                for(int i=R;i>=L;i--)
                {
                    output[k]=A[B][i];
                    k++;
                }
                B--;
                dir=3;
            }
            else if(dir==3)
            {
                for(int i=B;i>=T;i--)
                {
                    output[k]=A[i][L];
                    k++;
                }
                L++;
                dir=0;
            }
        }
        return output;
    }
}
