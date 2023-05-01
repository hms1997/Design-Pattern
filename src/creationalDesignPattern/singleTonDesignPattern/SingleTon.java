package creationalDesignPattern.singleTonDesignPattern;

import java.io.Serializable;

/***
 * This is an example of how to make a class completely singleton
 */

public final class SingleTon implements Serializable, Cloneable {
    //Declare a private static variable and initialize with null
    private static SingleTon instance = null;

    /***
     * Declare a private constructor to ensure no other class can directly create an object of
     * the singleton class.
     */
    private SingleTon() {
        // Throw an exception if someone is trying to create object using reflection
        if (instance != null) throw new RuntimeException("not allowed");

        /*** If someone use reflection first they will get an object and then if they call getInstance()
         *  they will get one more object. To prevent this do instance = this;
         */
        instance = this;
    }

    /***
     * Declare a public static method getInstance() which will allow only one instance of the class , wven if multiple thread
     * are requesting for instance at same time. Used double check locking to improve performance.
     * @return
     */
    public static SingleTon getInstance() {

        if (instance == null) {
            synchronized (SingleTon.class) {
                if (instance == null) {
                    instance = new SingleTon();
                }
            }
        }
        return instance;
    }

    /***
     * If my Singleton class is implementing Serializable interface then there is a chance that client can create 2 different
     * object by doing serialization and deserialization , to prevent this use readResolve() method and return the previously
     * created object.
     * @return
     */
    public Object readResolve() {
        return instance;
    }

    /***
     * If my Singleton class is implementing Cloneable interface then there is a chance that client can create 2 different
     * object by doing object cloning , to prevent this override clone method and return the previously
     * created object.
     * @return
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //return super.clone();
        return instance;
    }
}
