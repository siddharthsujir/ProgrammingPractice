package com.company;

import java.util.ArrayList;

public class IB_SortedInsertPosition {

    public static void main(String[] args)
    {
        ArrayList<Integer> a =new ArrayList<>();
        a.add(1);
        a.add(3);
        a.add(5);
        a.add(6);
        System.out.println(searchInsert(a,2));
    }

    public static int searchInsert(ArrayList<Integer> a, int b) {

        int start=0;
        int end=a.size()-1;
        if(a.size()==1)
        {
            if(a.get(0)==b)
                return b;
            else if(a.get(0)>b)
                return 0;
            else
                return 1;
        }
        else
        {
            while (start<=end)
            {
                int mid=(start+end)/2;

                if(a.get(mid)==b)
                    return mid;
                else if(a.get(mid)>b)
                {
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }

        }
        return start;
    }
}
