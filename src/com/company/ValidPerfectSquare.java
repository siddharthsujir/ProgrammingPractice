package com.company;

public class ValidPerfectSquare {

    public static boolean isPerfectSquare(int num) {

        if(num ==1 || num == 4 || num== 9)
            return true;
        else
        {
            int lastDigit= num%10;
            int num2=num/10;
            int secondLastDigit= num2%10;
            int lastTwo = (secondLastDigit*10)+lastDigit;

            if(lastDigit==2 || lastDigit== 3 || lastDigit==7 || lastDigit==8)
                return false;
            if(lastTwo%2==0 && lastTwo%4!=0)
                return false;

            switch (lastDigit)
            {
                case 0:
                    if(secondLastDigit!=0)
                        return false;
                    break;
                case 6:
                    if(secondLastDigit%2==0)
                        return false;
                    break;
                case 5:
                    if(secondLastDigit!=2)
                        return false;

            }

        }
        int i=4;
        int prevPower=0;
        while(prevPower<num)
        {
            if(i*i==num)
                return true;
            prevPower=i*i;
            i++;
        }

        return false;
    }


    public static void main(String[] args)
    {
        System.out.println(isPerfectSquare(100));
    }
}
