package designPatterns.prototype;

public class Student implements Prototype<Student> {
    private int id;
    private String name;
    private int age;
    private Float psp;

    public Student() {}

    // copy constructor
    public Student(Student student) {
        this.id = student.id;
        this.name = student.name;
        this.age = student.age;
        this.psp = student.psp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Student copy() {
        return new Student(this);
    }
}
