package com.company;

public class IB_MergeSort {

    public static void main(String[] args)
    {

        int[] arr={5,4,3,2,1};
        arr=mergeSort(arr,0,arr.length-1);

        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }

    public static int[] mergeSort(int[] arr,int start,int end)
    {
        if(start<end)
        {
            int mid=(start+end)/2;
            mergeSort(arr,start,mid);
            mergeSort(arr,mid+1,end);
            arr=merge(arr,start,mid,end);

        }
        return arr;
    }

    public static int[] merge(int[] arr,int start,int mid,int end)
    {
        int[] temp=new int[end-start+1];
        int k=0,i=start,j=mid+1;

        while (i<=mid && j<=end)
        {
            if(arr[i]<arr[j])
            {
                temp[k]=arr[i];
                i++;
                k++;
            }
            else
            {
                temp[k]=arr[j];
                j++;
                k++;
            }


        }

        while(i<=mid)
        {
            temp[k]=arr[i];
            i++;
            k++;
        }

        while(j<=mid)
        {
            temp[k]=arr[j];
            j++;
            k++;
        }

        for(int l=start;l<=end;l++)
        {
            arr[l]=temp[l-start];
        }

    return arr;
    }
}
