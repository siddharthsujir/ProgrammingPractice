package com.company;

public class LeetCode_PlusOne {

    public static int[] plusOne(int[] digits) {

        int len=digits.length;
        int j=len;
        int carry=0;
        int add=1;
        while(j>0)
        {
            //System.out.println("digit "+digits[j-1]+" carry "+ carry);
            int no=digits[j-1]+carry+add;
            add=0;
            carry=no/10;
           // System.out.println("Sum "+no    +"carry "+carry);

            if(carry==0)
            {
                digits[j-1]=no;
                return digits;
            }
            else
            {
                digits[j-1]=no%10;
            }
            j--;
        }

        if(carry!=0)
        {
            int[] arr=new int[len+1];
            for(int i=0;i<arr.length;i++)
            {
                if(i==0)
                    arr[i]=carry;
                else
                    arr[i]=digits[i-1];
            }
            return arr;
        }

       return digits;
    }

    public static void main(String[] args)
    {
        int[] arr={8,9,9};
        int[] output=plusOne(arr);
        for(int i=0;i<output.length;i++)
            System.out.println(output[i]);
    }
}
