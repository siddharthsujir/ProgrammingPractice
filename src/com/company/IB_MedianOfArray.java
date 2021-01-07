package com.company;

public class IB_MedianOfArray {

    public static void main(String[] args)
    {
        // 1 2 3 4 5 6 7 8
        int[] arr1={-1};
        int[] arr2={-1, 0, 4, 11, 18};
        System.out.println(medianOfArray(arr1,arr2));
    }

    public static int medianOfArray(int[] arr1,int[] arr2)
    {
        int count=0;
        int len1=arr1.length;
        int len2=arr2.length;
        int mid=(len1+len2)/2;
        int i=0,j=0;
        int current=0;
        int evenFlag=0;
        if((len1+len2)%2==0)
            evenFlag=1;
        int prev=0;

        while (count<mid+1 && i<len1 && j<len2)
        {
            if(arr1[i]<arr2[j])
            {

                prev=current;
                current=arr1[i];
                i++;
            }
            else
            {

                prev=current;
                current=arr2[j];
                j++;
            }

            count++;
        }

        while (count<mid+1 && i<len1 )
        {

                prev=current;
                current=arr1[i];
                i++;

            count++;
        }

        while (count<mid+1 && j<len2 )
        {

            prev=current;
            current=arr2[j];
            j++;

            count++;
        }


        //count=count-1;
        System.out.println("Current "+current+" prev "+prev+" count "+count);
        if(count-1%2!=0)
            return current;
        else
        {
            return (int)Math.ceil((prev+current)/2);
//            int next=0;
//            if(i<len1 && j<len2 && arr1[i]<arr2[j])
//                next=arr1[i];
//            else if(i<len1 && j<len2 && arr1[i]>=arr2[j])
//                next=arr2[j];
//            else
//            {
//                if(i>=len1 && j<len2)
//                    next=arr2[j];
//                else if(j>=len2 && i<len1)
//                    next=arr1[i];
//            }
//            return (int)Math.ceil((next+current)/2);
        }
    }
}
