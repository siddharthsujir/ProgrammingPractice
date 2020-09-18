package com.company;

public class LeetCode_SetMatrixZero {

    public void setZeroes(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        boolean rowFlag=false;
        boolean colFlag=false;

        for(int i=0;i<col;i++)
        {
            if(matrix[0][i]==0)
            {
                rowFlag=true;
                break;
            }

        }
        for(int i=0;i<row;i++)
        {
            if(matrix[i][0]==0)
            {
                colFlag=true;
                break;
            }

        }

        for(int i=1;i<row;i++)
        {
            for(int j=1;j<col;j++)
            {
//                if(matrix[0][j]==0 || matrix[i][0]==0)
//                    matrix[i][j]=0;
                if(matrix[i][j]==0)
                    matrix[0][j]=matrix[i][0]=0;
            }
        }

        for(int i=1;i<row;i++)
        {
            for(int j=1;j<col;j++)
            {
                if(matrix[0][j]==0 || matrix[i][0]==0)
                    matrix[i][j]=0;

            }
        }

        for(int i=0;rowFlag && i<col;i++)
        {
            matrix[0][i]=0;
        }

        for(int i=0;colFlag && i<col;i++)
        {
            matrix[i][0]=0;
        }
    }

    public  static void main(String[] args)
    {

    }
}
