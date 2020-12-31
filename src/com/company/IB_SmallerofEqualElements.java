package com.company;

public class IB_SmallerofEqualElements {

    public static void main(String[] args)
    {
        int[] arr={1, 2, 5, 5};
        int count=solve(arr,3);
        System.out.println(count);
    }
    public static int solve(int[] A, int B) {
        int count = 0;

        count=searchElement(A,0,A.length-1,B);
        return count;
    }
static int count=0;
    public static int searchElement(int[] A,int start,int end,int B)
    {
        if(start==end)
        {
            if(A[start]<=B)
                return count++;
            else
                return 0;
        }
        else
        {
            int mid=(start+end)/2;
            if(A[mid]>B)
            {
               searchElement(A,start,mid,B);

            }
            else if(A[mid]<=B)
            {
                searchElement(A,start,mid,B);
                searchElement(A,mid+1,end,B);

            }

        }

        return count;
    }
}
