package com.company;

import java.util.Arrays;

public class KthLargestElement {

    public static int findKthLargest(int[] nums, int k) {

        Arrays.sort(nums);
        int len=nums.length;
        return nums[len-k];
    }

    public static void main(String[] args)
    {
        int[] arr={3,2,3,1,2,4,5,5,6};
        System.out.println(findKthLargest(arr,4));
    }
}
