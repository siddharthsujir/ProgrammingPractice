package com.company;

public class IB_PerfectPeakOfArray {

    public static void main(String[] args)
    {
        int[] arr={9895, 30334, 17674, 23812, 20038, 25668, 6869, 1870, 4665, 27645, 7712, 17036, 31323, 8724, 28254, 28704, 26300, 25548, 15142, 12860, 19913, 32663, 32758};//{5, 1, 4, 3, 6, 8, 10, 7, 9};
        System.out.print(perfectPeak(arr));

    }

    public static int perfectPeak(int[] A) {

        int max_So_far=A[0];
        int flag=0;
        for(int i=1;i<A.length-1;i++)
        {
            flag=0;
            if(A[i]>max_So_far)
            {
                for(int j=i+1;j<A.length;j++)
                {
                    if(A[j]<A[i])
                    {
                        flag=0;
                        break;
                    }
                    flag=1;
                }
                if(flag==1)
                    return 1;

                max_So_far=A[i];
            }
            System.out.print(max_So_far+ " Max ");
        }
        return 0;
    }
}
