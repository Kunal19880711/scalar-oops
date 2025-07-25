package corejava.advanced.collections;

public class Student implements Comparable<Student> {
    private String name;
    private int rollNo;
    private int age;

    public Student(String name, int rollNo, int age) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        // Return 1, it will swap this, otherwise
        // Return -1, 0 it will not swap

        //        if (this.age > student.age) {
        //            return 1; // this is older, so it comes after
        //        }
        //         if (this.age < student.age) {
        //            return -1; // this is younger, so it comes before
        //        }

        if (this.age < student.age) {
            return 1; // this is younger, so it comes after
        }
        if (this.age > student.age) {
            return -1; // this is older, so it comes before
        }
        return 0; // same age, no swap

        //        return  -Integer.compare(this.age, student.age); // Compare ages directly

    }
}
