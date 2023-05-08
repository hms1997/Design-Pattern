package creationalDesignPattern.PrototypeAndRegistryDesignPatterns;

public class IntelligentStudent extends Student{
    private int iq;

    public IntelligentStudent(){}

    public IntelligentStudent(IntelligentStudent student) {
        super(student);
        this.iq = student.iq;
    }

    @Override
    public Student clone() {
        return new IntelligentStudent(this);
    }
}
