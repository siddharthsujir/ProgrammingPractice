package com.company;

public class SearchRowColumnSortedMatrix {

    public static boolean searchSortedMatrix(int[][] matrix, int target)
    {
        int rows=matrix.length;
        int columns=matrix[0].length;
        int i=0;
        int j=rows-1;

        while(i<rows && j>0)
        {
            if(matrix[i][j]==target)
            {
                System.out.println("Element found at row "+ (i+1) + " column " +(j+1));
                return true;
            }
            else if(matrix[i][j]>target)
                j--;
            else
                i++;
        }
        System.out.println("Element not found ");
        return false;
    }


    public static void main(String[] args)
    {
        int mat[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };

        searchSortedMatrix(mat,  15);
    }

}
