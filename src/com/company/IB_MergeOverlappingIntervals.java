package com.company;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Stack;

class Interval {
      int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }
  }

public class IB_MergeOverlappingIntervals {

    public static void main(String[] args)
    {

    }

    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {

        //ArrayList<Interval> output=new ArrayList<>();
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start-o2.start;
            }
        });

        //Stack<Interval> stack=new Stack<>();
        //stack.push(intervals.get(0));
        int index=0;
        for(int i=1;i<intervals.size();i++)
        {
            if(intervals.get(index).start>=intervals.get(i).end)
            {
                intervals.get(index).end=Math.max(intervals.get(index).end,intervals.get(i).end);
                intervals.get(index).start=Math.min(intervals.get(index).start,intervals.get(i).start);
            }
            else {
                index++;
                intervals.set(index,intervals.get(i));
            }

        }

        for(int i=index+1;i<intervals.size();i++)
        {
            intervals.remove(i);
        }
//        while (!stack.isEmpty())
//        {
//            Interval interval1=stack.pop();
//            output.add(interval1);
//        }
        return intervals;
    }
}
