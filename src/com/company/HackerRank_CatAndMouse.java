package com.company;

public class HackerRank_CatAndMouse {
    static String catAndMouse(int x, int y, int z) {
        int catA=0;
        int catB=0;

        catA=z>x?z-x:x-z;
        catB=z>y?z-y:y-z;

        if(catA>catB)
            return  "Cat B";
        else if (catB<catA)
            return  "Cat A";
        else if(catA==catB)
            return  "Mouse C";

        return "";
    }

}
