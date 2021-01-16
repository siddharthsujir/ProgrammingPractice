package com.company;

public class IB_SortByColor {

    public static void main(String[] args)
    {
        int[] arr={0, 1, 2, 0, 1, 2};
        arr=sortColors(arr);

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static int[] sortColors(int[] arr)
    {
        int i=0,j=i+1;

        while(i<arr.length-1)
        {
            while (j<arr.length)
            {
                if(arr[i]==arr[j])
                {
                  if(j==i+1)
                  {
                      //i++;
                      j++;
                  }
                  else
                  {
                      int temp=arr[i+1];
                      arr[i+1]=arr[j];
                      arr[j]=temp;
                      //i++;
                      //j++;
                  }
                }
                else
                    j++;
            }
            i++;
        }
        return arr;
    }
}
