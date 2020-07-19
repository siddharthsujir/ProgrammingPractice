package com.company;

public class RepeatingInteger {

    public static void repeatingInteger(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[Math.abs(arr[i])]>0)
                arr[Math.abs(arr[i])]=-arr[Math.abs(arr[i])];
            else
                System.out.println(Math.abs(arr[i]));
          //  System.out.println(Math.abs(arr[i]));
        }
    }


    public static void repeatingInteger2(int[] arr)
    {

        int length=arr.length;
        for(int i=0;i<length;i++)
        {
         //System.out.println(arr[arr[i]%length]);
            arr[arr[i]%length]=arr[arr[i]%length] +length;
        }

        for(int i=0;i<length;i++)
        {
            //System.out.println(arr[arr[i]%length]);
            arr[arr[i]%length]=arr[arr[i]%length] +length;
        }
    }

    public static void main(String[] args)
    {
        int[] arr={8,4,3,1,2,2,6,7,6,8};
        //repeatingInteger(arr);

        RepeatingInteger rpi=new RepeatingInteger();
        System.out.println(rpi);
        System.out.println(rpi.hashCode());
        System.out.println(Integer.toHexString(rpi.hashCode()));
        System.out.println(rpi.toString());
    }
}
