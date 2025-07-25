package designPatterns.builder.v1;

public class Student {
    private String name;
    private int age;
    private Float psp;
    private String batch;

    public Student(StudentBuilder builder) {
        validate(builder);
        this.name = builder.getName();
        this.age = builder.getAge();
        this.psp = builder.getPsp();
        this.batch = builder.getBatch();
    }

    void validate(StudentBuilder builder) {
        if (builder.getName() == null || builder.getName().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (builder.getAge() < 18) {
            throw new IllegalArgumentException("Student must be an adult (age >= 18)");
        }
        if (builder.getPsp() < 0) {
            throw new IllegalArgumentException("PSP cannot be negative");
        }
        if (builder.getBatch() == null || builder.getBatch().isEmpty()) {
            throw new IllegalArgumentException("Batch cannot be null or empty");
        }
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
}
