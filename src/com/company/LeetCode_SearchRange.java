package com.company;

public class LeetCode_SearchRange {

    public static int[] searchRange(int[] nums, int target) {

        int[] output=new int[2];
        int start=-1;
        int end=-1;
        int len=nums.length;
        output[0]=-1;
        output[1]=-1;
        if(len==0)
            return  output;
        if(target<nums[len/2])
        {
            output=findRange(nums,target,0,len/2);
        }
        else if(target>nums[len/2])
        {
            output=findRange(nums,target,(len/2)+1,len-1);
        }
        else
        {
            output=findRange(nums,target,0,len/2);
            start=output[0];
            if(start==-1)
                start=len/2;
            output=findRange(nums,target,(len/2),len-1);
            end=output[1];
                if(end==-1)
                    end=len/2;
        }

        return output;
    }

    public static int[] findRange(int[] nums,int target,int start,int end)
    {
        int[] output=new int[2];
        output[0]=-1;
        output[1]=-1;
        for(int i=start;i<end;i++)
        {
            if(nums[i]==target)
            {
                if(output[0]==0)
                    output[0]=i;

                while (nums[i]==target)
                {
                    i++;
                }
                output[1]=i-1;
                break;
            }
        }
        return output;
    }

    public static void main(String[] args)
    {
        int[] arr={5,7,7,8,8,10};
        int[] output=searchRange(arr,6);
        System.out.println(output[0]+" "+output[1]);

    }
}
