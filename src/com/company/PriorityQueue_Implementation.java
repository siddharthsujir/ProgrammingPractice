package com.company;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

class NumberComparator implements Comparator<Integer>
{
    public int compare(Integer i1,Integer i2)
    {
        Integer int1;
        Integer int2;
        int1=i1;
        int2=i2;

        return int1.compareTo(int2);
    }
}
public class PriorityQueue_Implementation {



        public static void main(String[] args)
        {
            PriorityQueue<Integer> pq= new PriorityQueue<>(new NumberComparator());
            int[] arr={2,3,1,5,4};

            for(int i=0;i<arr.length;i++)
            {
                pq.add(arr[i]);
            }

            //Iterator<Integer> it=pq.iterator();

            while (!pq.isEmpty())
            {
                System.out.println(pq.remove());
            }
        }
}
