package com.company;

public class HackerRank_CountProperFractions {

    // fraction i/j where i<j and hcf(i,j)==1
    public static int countProperFractions(int max_d) {

        int count=0;
        for(int i =1;i<=max_d;i++)
        {

            for(int j=i+1;j<=max_d;j++)
            {
                if(i==1)
                    count++;
                else
                {

                    if(j%i!=0)
                    {
                        System.out.println(i+"/"+j);
                        if(hcf(i, j)==1)
                            count++;
                    }

                }
            }

        }
        return count;
    }

    public static int hcf(int i,int j)
    {

        if (i == 0)
            return j;
        if (j == 0)
            return i;
        if (i == j)
            return i;
        if (i > j)
            return hcf(i-j,j);
        return hcf(i,j-i);

    }

}
