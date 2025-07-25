package designPatterns.builder.v3;

public class Client {
    public static void main(String[] args) {

        try {
            Student student = Student.builder()
                    .name("John Doe")
                    .age(20)
                    .psp(1.5f)
                    .batch("Morning25")
                    .build();
            System.out.println("Student created successfully: " + student.getName());
        } catch (IllegalArgumentException e) {
            System.err.println("Error creating student: " + e.getMessage());
        }
    }
}
