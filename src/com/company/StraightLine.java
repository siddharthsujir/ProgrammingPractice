package com.company;

public class StraightLine {

    public static boolean checkStraightLine(int[][] coordinates) {

        int len=coordinates.length;
        double x=coordinates[1][0]-coordinates[0][0];
        double y=coordinates[1][1]-coordinates[0][1];
        double slope;
        if(len==2)
            return true;

        if(x==0)
        {
            for(int i=1;i<len-1;i++)
            {
                if(coordinates[i+1][0]-coordinates[i][0]>x)
                    return false;
            }
        }
        else if(y==0)
        {
            for(int i=1;i<len-1;i++)
            {
                if(coordinates[i+1][1]-coordinates[i][1]>y)
                    return false;
            }
        }
        else{

            x=coordinates[0][0]-coordinates[1][0];
            if(x==0)
                return false;
            y=coordinates[0][1]-coordinates[1][1];
            if(y==0)
                return false;
            slope= Math.abs(y/x);
            System.out.println(slope);
            for(int i=1;i<len-1;i++)
            {
                double newSlope=0;
                x=coordinates[i][0]-coordinates[i+1][0];
                if(x==0)
                    return false;
                y=coordinates[i][1]-coordinates[i+1][1];
                if(y==0)
                    return false;
                newSlope= y/x;
                System.out.println(newSlope);
                if(newSlope!=slope)
                    return false;
            }
        }


        return true;


    }


    public  static  void main(String[] args)
    {
        int[][] arr={{1,-8},{2,-3},{1,2}};
        System.out.println(checkStraightLine(arr));
    }
}
