package com.company;

public class Leetcode_SearchinRotatedSortedArray {

    public static int search(int[] nums, int target) {

        if(nums.length==1 && nums[0]==target)
            return 0;
        else if(nums.length==1 && nums[0]==target)
            return -1;
        else if(nums[0]==target)
            return 0;
        else if(nums[nums.length-1]==target)
            return nums.length-1;
        else
        {
            return searchTarge(nums,0,nums.length-1,target);
        }





    }

    public static int searchTarge(int[] nums,int start,int end, int target)
    {
        System.out.println("Start "+start+" end "+end);
        if(start==end && nums[start]==target)
            return start;
        else if(start==end && nums[start]!=target)
            return -1;
        else if(end-start==1)
        {
            if(target==nums[start])
                return start;
            else if(target==nums[end])
                return end;
            else
                return -1;
        }
        else {
            int middleElement = (start + end) / 2;
            if (nums[middleElement] == target)
                return middleElement;
            else if (nums[middleElement] < target && nums[end] < target) {
               // System.out.println("1");
                return searchTarge(nums, middleElement, end, target);
            } else if (nums[middleElement] < target && nums[end] > target) {
               // System.out.println("2");
                return searchTarge(nums, middleElement, end, target);
            } else if (nums[middleElement] > target && nums[start] < target) {
                //System.out.println("3");
                return searchTarge(nums, start, middleElement, target);
            } else if (nums[middleElement] > target && nums[start] > target) {
                ///System.out.println("4");
                return searchTarge(nums, middleElement, end, target);
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int[] arr={4,5,6,7,8,1,2,3};
        int target=8;
        System.out.println(search(arr,target));

    }
}
