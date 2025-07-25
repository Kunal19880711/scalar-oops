package designPatterns.builder.v2;

public class StudentBuilder {
    private String name;
    private int age;
    private Float psp;
    private String batch;

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setPsp(Float psp) {
        this.psp = psp;
        return this;
    }

    public StudentBuilder setBatch(String batch) {
        this.batch = batch;
        return this;
    }


    private void validate() {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (age < 18) {
            throw new IllegalArgumentException("Student must be an adult (age >= 18)");
        }
        if (psp < 0) {
            throw new IllegalArgumentException("PSP cannot be negative");
        }
        if (batch == null || batch.isEmpty()) {
            throw new IllegalArgumentException("Batch cannot be null or empty");
        }
    }


    public Student build() {
        validate();
        return new Student(this);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Float getPsp() {
        return psp;
    }

    public String getBatch() {
        return batch;
    }
}
