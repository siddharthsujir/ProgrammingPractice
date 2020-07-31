package com.company;

public class StraightLine {

    public static boolean checkStraightLine(int[][] coordinates) {

        int len=coordinates.length;
        int x=coordinates[1][0]-coordinates[0][0];
        int y=coordinates[1][1]-coordinates[0][1];
        if(len==2)
            return true;
       for(int i=1;i<len-1;i++)
       {
           if(coordinates[i+1][0]-coordinates[i][0]>x)
               return false;
           else if(coordinates[i+1][1]-coordinates[i][1]>y)
               return false;
       }

            return true;
    }

    public  static  void main(String[] args)
    {
        int[][] arr={{1,2},{2,3},{3,5}};
        System.out.println(checkStraightLine(arr));
    }
}
