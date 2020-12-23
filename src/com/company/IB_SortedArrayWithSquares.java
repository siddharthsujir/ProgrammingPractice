package com.company;

public class IB_SortedArrayWithSquares {

    public static void main(String[] args)
    {
        int[] arr={-6, -3, -1,-1, 2, 4, 5};
        arr=solve(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }

    public static  int[] solve(int[] A) {

        int flag = 0;
        int isPositive=-1;
        int[] temp=new int[A.length];
        int k=A.length-1;
        if (A[0] < 0)
            flag = 1;

        if (flag == 1) {
                int i=0;
                int j=A.length-1;

                while(i<=j)
                {
                    int i2=A[i]*A[i];
                    int j2=A[j]*A[j];
//                    System.out.print(i2 + " "+ j2);
                    if(i2>j2)
                    {
                        temp[k]=i2;
                        i++;
                        k--;
                    }
                    else
                    {temp[k]=j2;
                    j--;
                    k--;
                    }


                }

                A=temp;
        } else
        {
            for (int i = 0; i < A.length; i++) {
                A[i]=A[i]*A[i];
            }
        }
return A;

    }
}
