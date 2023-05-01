package creationalDesignPattern.builderDesignPattern;

public class Student {
    private String name;
    private int age;
    private String email;
    private String batch;
    private double psp;
    private String university;

    private Student(StudentBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
        this.batch = builder.batch;
        this.psp = builder.psp;
        this.university = builder.university;
    }

    public static StudentBuilder getStudentBuilder() {
        return new StudentBuilder();
    }


    public static class StudentBuilder {
        public String name;
        public int age;
        public String email;
        public String batch;
        public double psp;
        public String university;

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public StudentBuilder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public StudentBuilder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public StudentBuilder setUniversity(String university) {
            this.university = university;
            return this;
        }

        public Student buildStudent() {
            return new Student(this);
        }
    }
}
