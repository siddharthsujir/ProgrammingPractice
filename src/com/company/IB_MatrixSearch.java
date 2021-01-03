package com.company;

public class IB_MatrixSearch {

    public static void main(String[] args)
    {
        int[][] Matrix={{1, 11, 49, 74, 77, 78, 93, 94}};//{{3, 3, 11, 12, 14}, {16, 17, 30, 34, 35},{45, 48, 49, 50, 52},{56, 59, 63, 63, 65},{67, 71, 72, 73, 79},{80, 84, 85, 85, 88},{88, 91, 92, 93, 94}   };
        System.out.println(searchMatrix(Matrix,94));


    }


    public static int searchMatrix(int[][] A, int B) {

        int i=0,j=0;
        int k=0;
        if(A[i][j]==B)
            return 1;

        if(A.length==1)
        {
            int columns=A[0].length;

            int start=0;
            int end=columns-1;
            while(start<end)
            {
                int mid=(start+end)/2;
                if(A[0][mid]==B)
                    return 1;
                else if(A[0][mid]>B)
                {
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }

            return -1;
        }

        if(A[0].length==1)
        {
            int rows=A.length;

            int start=0;
            int end=rows-1;
            while(start<end)
            {
                int mid=(start+end)/2;
                if(A[mid][0]==B)
                    return 1;
                else if(A[mid][0]>B)
                {
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }

            return -1;
        }

        int rowStart=0,columnStart=0,rowEnd=A.length-1,columnEnd=A[0].length-1;


        while(rowStart<=rowEnd && columnStart<=columnEnd)
        {
            // System.out.println("rowStart "+rowStart+" columStart "+columnStart+" rowEnd "+rowEnd+" columnEnd "+columnEnd);
            int rowMid=(rowStart+rowEnd)/2;
            int columnMid=(columnStart+columnEnd)/2;

            if(A[rowMid][columnMid]==B)
                return 1;

            if(A[rowMid][columnMid]>B)
            {
                rowEnd=rowMid-1;
                columnEnd=columnMid;

                for( i=columnStart;i<columnMid;i++)
                {
                    if(A[rowMid][i]==B)
                        return 1;
                }

            }
            else if(A[rowMid][columnMid]<B)
            {
                rowStart=rowMid+1;
                columnStart=columnMid+1;
                for( i=columnMid;i<=columnEnd;i++)
                {
                    if(A[rowMid][i]==B)
                        return 1;
                }
            }
        }

        return 0;

    }


    public static int searchMatrix2(int[][] A,int B)
    {
        int rowStart=0,columnStart=0,rowEnd=A.length-1,columnEnd=A[0].length-1;

        int columnMid=(columnStart+columnEnd)/2;
        int rowMid=(rowEnd+rowStart)/2;
        if(A[rowMid][columnMid]==B)
            return 1;
        if(A[rowMid][columnMid]<B)
        {
            rowEnd=rowMid;
        }
        else
        {
            rowStart=rowMid;
        }

        for(int i=0;i<=rowEnd;i++)
        {
            if(A[i][columnMid]==B)
                return 1;
        }

        for(int i=rowStart;i<=rowEnd;i++)
        {
            for(int j=columnStart;j<=columnEnd;j++)
            {
                if(A[i][j]==B)
                    return 1;
            }
        }
        return 0;
    }
}
