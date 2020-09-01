package com.company;

public class LeetCode_FirstBadVersion {

    boolean isBadVersion(int version)
    {
        return true;
    }
    public int firstBadVersion(int n) {

        boolean flag=true;
        int i=n;

        if(n==1)
            return 1;

        while(flag)
        {

            if(i<=0)
                return -1;

            if(isBadVersion(i))
                flag=false;

            i=i-2;


        }

        if(isBadVersion(i+1))
            return i+1;
        else
            return i;

    }
}
