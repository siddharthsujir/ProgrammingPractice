package com.company;

public class IB_MaximumUnsortedSubArray {

    public static void main(String[] args)
    {
        int[] arr={1, 3, 2, 4, 5};
       //{1, 2, 3, 5, 6, 13, 15, 16, 17, 13, 13, 15, 17, 17, 17, 17, 17, 19, 19};
        //{1, 1, 10, 10, 15, 10, 15, 10, 10, 15, 10, 15}
        //{4, 15, 4, 4, 15, 18, 20};
        int[] output=subUnsort(arr);
//lpos=2
        //rpos=1
        for(int i=0;i<output.length;i++)
            System.out.print(output[i]+" ");
    }

    public static int[] maxUnsortedArray(int[] arr)
    {
        int[] output= new int[2];
        int i=0,k=0;
        int lpos=0,rpos=0;
        for( i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
                break;
        }

        for( k=arr.length-1;k>0;k--)
        {
            if(arr[k]<arr[k-1])
                break;
        }

        if(i==arr.length-1 && k==0)
            {
                output=new int[1];
                output[0]=-1;
                return output;
            }

        else
        {
            lpos=i+1;
            rpos=k-1;

            int max=arr[lpos];
            int min=arr[rpos];


            for(int j=0;j<lpos;j++)
            {
                if(arr[j]>arr[lpos])
                {
                        lpos=j;
                        break;
                }

            }

            for(int j=arr.length-1;j>rpos;j--)
            {
                if(arr[j]<arr[rpos])
                {
                    rpos=j;
                    break;
                }

            }

            output[0]=lpos;
            output[1]=rpos;
        }
        return output;
    }

    public static int[] subUnsort(int[] arr) {
        int lpos=0;
        int rpos=0;
        int left=0;
        int right=0;
        int i=0;
        int j=0;
        int[] output=new int[2];
        for( i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
                break;
        }

        for( j=arr.length-1;j>0;j--)
        {
            if(arr[j]<arr[j-1])
                break;
        }

        if(i==arr.length-1)
        {
            output=new int[1];
            output[0]=-1;
        }
System.out.println("i "+i+" j "+j);
        lpos=i;
        rpos=j;
        int min=arr[lpos];
        int max=arr[rpos];
        for(int k=lpos+1;k<=rpos;k++)
        {
            if(arr[k]<min)
                min=arr[k];
            if(arr[k]>max)
                max=arr[k];
        }

        for( i=0;i<lpos;i++)
        {
            if(arr[i]>min)
            {
                left=i;
                break;
            }

        }

        for(j=arr.length-1;j>rpos;j--)
        {
            if(arr[j]<max)
            {
                right=max;
                break;
            }

        }

        output[0]=left;
        output[1]=right;

        return output;
    }
}


