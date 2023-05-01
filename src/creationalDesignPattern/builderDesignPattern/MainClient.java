package creationalDesignPattern.builderDesignPattern;

import creationalDesignPattern.singleTonDesignPattern.SingleTon;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/***
 * CREATED BY HIMANSHU
 */
public class MainClient {
    public static void main(String[] args) {

        Student student1 = Student.getStudentBuilder().setName("Himangshu")
                .setAge(26)
                .setBatch("july 2022")
                .setPsp(60.50)
                .setEmail("abc@gmail.com")
                .setUniversity("VTU")
                .buildStudent();

        Student student2 = Student.getStudentBuilder().setName("purnima")
                .setBatch("july 2022")
                .setPsp(80.99)
                .setEmail("def@gmail.com")
                .setUniversity("NIT")
                .buildStudent();

        Student student3 = Student.getStudentBuilder().setName("sheetal")
                .setBatch("july 2022")
                .setPsp(99.99)
                .setEmail("xyz@gmail.com")
                .setUniversity("VTU")
                .buildStudent();


    }
}
