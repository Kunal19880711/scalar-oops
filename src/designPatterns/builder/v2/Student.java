package designPatterns.builder.v2;

public class Student {
    private String name;
    private int age;
    private Float psp;
    private String batch;

    public Student(StudentBuilder builder) {
        this.name = builder.getName();
        this.age = builder.getAge();
        this.psp = builder.getPsp();
        this.batch = builder.getBatch();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Float getPsp() {
        return psp;
    }

    public void setPsp(Float psp) {
        this.psp = psp;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public static StudentBuilder getBuilder() {
        return new StudentBuilder();
    }
}
