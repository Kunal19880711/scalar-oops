package designPatterns.builder.v3;

public class Student {
    private String name;
    private int age;
    private Float psp;
    private String batch;

    private Student(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.psp = builder.psp;
        this.batch = builder.batch;
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

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String name;
        private int age;
        private Float psp;
        private String batch;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder psp(Float psp) {
            this.psp = psp;
            return this;
        }

        public Builder batch(String batch) {
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
            if (psp != null && psp < 0) {
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
    }
}