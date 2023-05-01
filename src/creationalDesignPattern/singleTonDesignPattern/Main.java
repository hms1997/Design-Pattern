package creationalDesignPattern.singleTonDesignPattern;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/***
 * CREATED BY HIMANSHU
 */
public class Main {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException,
            NoSuchMethodException, CloneNotSupportedException {
        //Trying to break singleton pattern using Reflection
        SingleTon s1 = SingleTon.getInstance();
        System.out.println(s1.hashCode());

        Constructor<SingleTon> constructor = SingleTon.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        //This line will generate exception because we are throwing exception in Singleton class constructor
        SingleTon s2 = constructor.newInstance();
        System.out.println(s2.hashCode());


        // Trying to break singleton using serialization and deserialization
        try {
            // Serialization
            FileOutputStream fos = new FileOutputStream("singleton.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream("singleton.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            SingleTon s3 = (SingleTon) ois.readObject();
            ois.close();
            fis.close();
            System.out.println(s3.hashCode());
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }


        // Trying to break SingleTon using object cloning
        SingleTon s4 = (SingleTon) s1.clone();
        System.out.println(s4.hashCode());
    }
}
