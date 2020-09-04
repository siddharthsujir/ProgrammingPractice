package com.company;

public class ChooseLead {

    public static String chooseLead(String[] arr)
    {
        long count=0;
        String output="";

        for(int i=0;i<arr.length;i++)
        {
            long temp=arr[i].chars().distinct().count()-1;
            //System.out.println(temp);
            if(temp>count)
            {
                count=temp;
                output=arr[i];
            }
        }
        return output;
    }

    public static void main(String[] args)
    {
        String[] arr= {
                "kylan charles",
                "raymond strickland",
                "julissa shepard",
                "andrea meza",
                "destiney alvarado"
        };

        System.out.println(chooseLead(arr));
    }
}
