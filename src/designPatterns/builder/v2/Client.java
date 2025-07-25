package designPatterns.builder.v2;

public class Client {
    public static void main(String[] args) {

        try {
//            Student student = Student.getBuilder()
//                    .setName("John Doe")
//                    .setAge(20)
//                    .setPsp(1.5f)
//                    .setBatch("Morning25")
//                    .build();
            Student student = Student.getBuilder()
                    .setName("John Doe")
                    .setAge(20)
                    .setPsp(1.5f)
                    .setBatch("Morning25")
                    .build();
            System.out.println("Student created successfully: " + student.getName());
        } catch (IllegalArgumentException e) {
            System.err.println("Error creating student: " + e.getMessage());
        }
    }
}
