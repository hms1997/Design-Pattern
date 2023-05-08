package creationalDesignPattern.PrototypeAndRegistryDesignPatterns;


/***
 * Prototype is a creational design pattern that lets you copy existing objects without making your code dependent on their classes.
 */
public class Client {
    /***
     * Applicability
     *  Use the Prototype pattern when your code shouldn’t depend on the concrete classes of objects that you need to copy.
     *
     *  This happens a lot when your code works with objects passed to you from 3rd-party code via some interface.
     *  The concrete classes of these objects are unknown, and you couldn’t depend on them even if you wanted to.
     * The Prototype pattern provides the client code with a general interface for working with all objects that support cloning.
     * This interface makes the client code independent of the concrete classes of objects that it clones.
     *
     *
     *
     *  Use the pattern when you want to reduce the number of subclasses that only differ in the way they initialize their
     *  respective objects.
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        StudentRegistry registry = new StudentRegistry();
        fillRegistry(registry);

        Student s1 = registry.get("june22").clone();
        s1.setName("Himanshu");
        s1.setAge(20);
        s1.setAverageBatchPsp(70);
        s1.setStudentPsp(75);

        Student s2 = registry.get("june22").clone();
        s2.setName("Purnima");
        s2.setAge(21);
        s2.setAverageBatchPsp(70);
        s2.setStudentPsp(75);

        Student s3 = registry.get("june22Intelligent").clone();
        s3.setName("Sheetal");
        s3.setAge(22);
        s3.setAverageBatchPsp(70);
        s3.setStudentPsp(75);
    }

    public static void fillRegistry(StudentRegistry registry) {
        Student s = new Student();
        s.setBatch("june 22");
        s.setStudentPsp(70);
        registry.register("june22", s);

        IntelligentStudent s1 = new IntelligentStudent();
        s1.setBatch("june 22 intelligent");
        s1.setAverageBatchPsp(95);
        registry.register("june22Intelligent", s1);
    }
}
