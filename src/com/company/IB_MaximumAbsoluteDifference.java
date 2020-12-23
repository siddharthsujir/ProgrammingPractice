package com.company;

public class IB_MaximumAbsoluteDifference {

    public static int maxArr(int[] A) {
        int max=Integer.MIN_VALUE;

        for(int i=0;i<A.length;i++)
        {
            max=findAbsDifference(A,i,max);
        }
        return max;
    }

    public static int findAbsDifference(int[] A,int i,int max)
    {
        int m=max;
        for(int j=0;j<A.length;j++)
        {
            int sum=0;
            sum=Math.abs(A[i]-A[j])+Math.abs(i-j);
            if(sum>m)
            {
                System.out.println(i+" "+j);
                m=sum;
            }

        }
        return m;
    }

    public static int maxArr2(int[] A) {
        int maxSum=Integer.MIN_VALUE;
        int minSum=Integer.MAX_VALUE;
        int difSum=0;
        for(int i=0;i<A.length;i++)
        {
            maxSum=Math.max(maxSum,A[i]+i);
            minSum=Math.min(minSum,A[i]+i);
        }
        difSum=maxSum-minSum;

        int maxDif=Integer.MIN_VALUE;
        int minDif=Integer.MAX_VALUE;
        int difD=0;
        for(int j=0;j<A.length;j++)
        {
            maxDif=Math.max(maxDif,A[j]-j);
            minDif=Math.min(minDif,A[j]-j);
        }

        difD=maxDif-minDif;

        return Math.max(difSum,difD);
    }

    public static void main(String[] args)
    {
            int[] arr={1, 3, -1};
            System.out.println(maxArr2(arr));
    }
}
