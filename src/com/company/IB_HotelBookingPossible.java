package com.company;

import java.lang.reflect.Array;
import java.net.CookieHandler;
import java.util.*;

public class IB_HotelBookingPossible {

    public static void main(String[] args)
    {
        ArrayList<Integer> arrivalTime=new ArrayList<>();

        ArrayList<Integer> departureTime=new ArrayList<>();

        arrivalTime.add(1);
        arrivalTime.add(2);
        arrivalTime.add(3);
        arrivalTime.add(4);

        departureTime.add(10);
        departureTime.add(2);

        departureTime.add(6);
        departureTime.add(14);

        System.out.print(hotel(arrivalTime,departureTime,4));;
    }

    public static boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {

        Collections.sort(arrive);
        int maxDepartureTime=depart.get(0);
        int room=1;
        if(arrive.size()==K)
            return true;

        for(int i=1;i<arrive.size();i++)
        {
            System.out.println("Arrival Time: "+arrive.get(i));
            for(int j=0;j<i;j++)
            {
                System.out.println("departure Time: "+depart.get(j));
                if(arrive.get(i)<depart.get(j))
                {
                    room++;
                    if(room>K)
                        return false;
                }
                else
                    break;
            }
        }

        return true;
    }

    public static boolean hotel2(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {

        Collections.sort(arrive);
        Collections.sort(depart);
        int i=0,j=0,roomsRequired=0;

        while(i<arrive.size() && j<depart.size() && roomsRequired<=K)
        {
            if(arrive.get(i)<depart.get(i))
            {
                i++;
                roomsRequired++;
            }
            else
            {j++;
            roomsRequired--;
            }



        }
        if(roomsRequired<=K)
            return true;
        else
            return false;
    }
}
