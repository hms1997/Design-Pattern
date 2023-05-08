package creationalDesignPattern.PrototypeAndRegistryDesignPatterns;

public class Student implements Prototype<Student>{
    private int age;
    private String name;
    private String batch;
    private double averageBatchPsp;
    private double studentPsp;

    public Student(){}

    public Student(Student s) {
        this.age = s.age;
        this.name = s.name;
        this.batch = s.batch;
        this.averageBatchPsp = s.averageBatchPsp;
        this.studentPsp = s.studentPsp;

    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setAverageBatchPsp(double averageBatchPsp) {
        this.averageBatchPsp = averageBatchPsp;
    }

    public void setStudentPsp(double studentPsp) {
        this.studentPsp = studentPsp;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }
}
