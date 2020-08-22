package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class HackerRank_SimpleTextEditor {

    static String previous="";
    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int query=0;
        String queryVal="";
        String str="" ;
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        query=Integer.parseInt(br.readLine());
        Stack<String> s= new Stack<>();
        s.push(str);
        while (query>0)
        {
            queryVal=br.readLine();
            String[] options=queryVal.split(" ");
            int option=Integer.parseInt(options[0]);
            int k=0;
            switch (option)
            {
                case 1:
                    String text=options[1];
                    str=s.peek();
                    str=appendString(str,text);
                    s.push(str);
                    break;
                case 2:
                    k=Integer.parseInt(options[1]);
                    str=s.peek();
                    str=deleteKCharacters(str,k);
                    s.push(str);
                    break;
                case 3:
                    k=Integer.parseInt(options[1]);
                    str=s.pop();
                    printKthCharacter(str,k);
                    s.push(str);
                    break;
                case 4:
                    s.pop();
                    break;

            }

            query--;
        }
       // System.out.println(deleteKCharacters("string",6));
    }

    public static String appendString(String str, String toAppend)
    {
        str=str.concat(toAppend);
        return str;
    }

    public static String deleteKCharacters(String str,int k)
    {
        str=str.substring(0,str.length()-k);
        return str;
    }

    public static void printKthCharacter(String str,int k)
    {

        if(str!="")
            System.out.println(str.charAt(k-1));
        else
            System.out.println("");
    }




}
