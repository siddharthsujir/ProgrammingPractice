package com.company;

public class IB_SearchInBitonicArray {

    public static void main(String[] args)
    {
        int[] arr={5, 6, 7, 8, 9, 10, 3, 2, 1};
        System.out.println(solve(arr,17));
    }

    public static int solve(int[] A, int B) {

        int start=0;
        int end=A.length-1;

        return search(A,start,end,B);



    }

    public static int search(int[] arr,int start,int end, int key)
    {
        if(end<start)
            return -1;

        int mid=(start+end)/2;

        if(arr[mid]==key)
            return mid;

        int index=search(arr,start,mid-1,key);
        int index2=search(arr,mid+1,end,key);

        if(index==-1)
            return index2;
        else
            return index;
    }
}
