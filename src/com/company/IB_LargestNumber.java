package com.company;

import common;
import java.util.*;

public class IB_LargestNumber {

    public static void main(String[] args)
    {
        int[] arr={3, 30, 34, 5, 9};
        System.out.print(largestNumber(arr));
    }

    public static String largestNumber(final int[] A) {

        ArrayList<Integer> arr=new ArrayList<>();
        String output="";

        for(int i=0;i<A.length;i++)
            arr.add(i,A[i]);

        Integer[] sorted = ArrayUtils.toObject(A);

        Collections.sort(arr,
                new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {

                        String XY=o1.toString()+o2.toString();
                        String YZ=o2.toString()+o1.toString();


                        return XY.compareTo(YZ)>0?-1:1;
                    }
                }
        );

        Iterator it=arr.iterator();

        while(it.hasNext())
        {
            String t=it.next().toString();
            if(!t.equals("0"))
                output=output+it.next();
        }

        if(output.equals(""))
            return "0";

        return output;
    }
}
