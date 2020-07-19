package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Student implements Serializable
{
    String StudentName;
    String course;

    Student(String name, String course)
    {
        this.StudentName=name;
        this.course=course;
    }
}

public class SerializationExample  {

    public static void main(String[] args) throws IOException,ClassNotFoundException
        {
        Student s = new Student("Sid", "Data Science");

            List<Character> list = new ArrayList<>();
            list.contains('c');

        FileOutputStream fos=new FileOutputStream("out.txt");
        ObjectOutputStream ois= new ObjectOutputStream(fos);
        ois.writeObject(s);
        System.out.println("Serialization Complete!");

        FileInputStream fis=new FileInputStream("out.txt");
        ObjectInputStream oos= new ObjectInputStream(fis);
        Student s2= (Student) oos.readObject();

        System.out.println("Deserialization Complete!");
        System.out.println(s2.StudentName+" has taken "+s2.course);
        }

}
