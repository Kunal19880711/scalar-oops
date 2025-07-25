package designPatterns.builder.v1;

public class Client {
    public static void main(String[] args) {
        StudentBuilder studentBuilder = new StudentBuilder();
//        studentBuilder.setName("John Doe");
        studentBuilder.setAge(20);
        studentBuilder.setPsp(1.5f);
        studentBuilder.setBatch("Morning25");

        try {
            Student student = new Student(studentBuilder);
            System.out.println("Student created successfully: " + student.getName());
        } catch (IllegalArgumentException e) {
            System.err.println("Error creating student: " + e.getMessage());
        }
    }
}
