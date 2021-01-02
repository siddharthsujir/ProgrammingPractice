package com.company;

public class IB_SearchRotatedSortedArray {

    public static void main(String[] args)
    {
            int[] arr={ 106, 109, 158, 164, 182, 187, 202, 205, 2, 3, 32, 57, 69, 74, 81, 99, 100,101, 103};
            //System.out.println(search(arr,6));
        System.out.println(search(arr,202));
    }

    public static int search(int[] A,int B)
    {
        int pivot= findPivot(A,0,A.length-1);

        if(pivot==-1)
            return binarySearch(A,0,A.length-1,B);

        if(A[pivot]==B)
            return pivot;
        else if(A[0]<=B)
            return binarySearch(A,0,pivot-1,B);
        else
            return binarySearch(A,pivot+1,A.length-1,B);

    }

    public static int binarySearch(int[] A,int start,int end,int key)
    {

        if(start<end)
            return -1;

        int mid=(start+end)/2;

        if(A[mid]==key)
            return mid;

        else if(A[mid]>key)
            return binarySearch(A,start,mid-1,key);
        else
            return binarySearch(A,mid+1,end,key);

    }

    public static int findPivot(int[] arr,int start,int end)
    {
        if(end<start)
            return -1;

        if(start==end)
            return start;

        int mid=(start+end)/2;

        if(mid<end && arr[mid]>arr[mid+1])
            return mid;

        if(mid>start && arr[mid]<arr[mid-1])
            return mid-1;

        if(arr[start]>=arr[mid])
            return findPivot(arr,start,mid-1);

        return findPivot(arr,mid+1,end);


    }


}
