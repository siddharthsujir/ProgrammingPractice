package com.company;

import java.util.List;

public class IB_RepeatNBy3Times {

    public static void main(String[] args)
    {

    }

    public int repeatedNumber(final List<Integer> a) {

        int count1=0,count2=0;

        int first=Integer.MAX_VALUE;
        int second= Integer.MAX_VALUE;
        int maxCount1=Integer.MIN_VALUE;
        int maxCount2=Integer.MIN_VALUE;
        int maxFirst=0,maxsecond=0;

        if(a.size()==1)
            return a.get(0);

        for(int i=0;i<a.size();i++)
        {

            if(count1>=maxCount1)
            {
                maxCount1=count1;
                maxFirst=first;
            }

            if(count2>=maxCount2)
            {
                maxCount2=count2;
                maxsecond=second;
            }
            //System.out.println(count1+" "+count2);//+" "+first+ " "+second);
            if(a.get(i)==first)
                count1++;

            else if(a.get(i)==second)
                count2++;

            else if(count1==0)
            {
                count1++;
                first=a.get(i);
            }
            else if(count2==0)
            {
                count2++;
                second=a.get(i);
            }
            else
            {
                count1--;
                count2--;
            }
        }

        //System.out.println("first "+maxFirst+" second "+maxsecond);
        count1=0;
        count2=0;

        for(int i=0;i<a.size();i++)
        {
            if(a.get(i)==maxFirst)
                count1++;

            else if(a.get(i)==maxsecond)
                count2++;
        }

        if(count1>a.size()/3)
            return maxFirst;
        else if(count2>a.size()/3)
            return maxsecond;
        else
            return -1;
    }
}
