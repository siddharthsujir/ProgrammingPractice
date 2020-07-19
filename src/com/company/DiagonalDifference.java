package com.company;

import java.util.List;

public class DiagonalDifference {


    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here

        int rows= arr.size();
        int columns = arr.get(0).size();
        int pSum=0;
        int sSum=0;
        int i=0;
        int j=0;
        int output=0;

        System.out.println(rows+ " "+columns);

        while(i<rows && j< columns)
        {
            pSum=pSum+arr.get(i).get(j);
            i++;
            j++;
        }
        i--;
        j--;
        while(i>=0 && j>=0)
        {
            sSum=sSum+arr.get(i).get(j);
            i--;
            j--;
        }
        output=Math.abs(pSum-sSum);
        return output;
    }

    public static void main(String[] args)
    {

    }



}
