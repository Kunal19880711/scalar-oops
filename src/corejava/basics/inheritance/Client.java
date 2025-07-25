package corejava.basics.inheritance;

public class Client {
    public static void main(String[] args) {
        // create a user and print its details
        User user = new User("1", "John Doe");
        System.out.println("User ID: " + user.getId());
        System.out.println("User Name: " + user.getCourse()); // Actually returns name due to User implementation

        // create a student and print its details
        Student student = new Student("2", "Jane Smith", "S12345", "Computer Science", 90);
        System.out.println("Student ID: " + student.getId());
        System.out.println("Student Name: " + student.getCourse()); // Actually returns course
        System.out.println("Student Batch: " + student.getBatch());
        System.out.println("Student Course: " + student.getCourse());
        System.out.println("Student PSP: " + student.getPsp());

        Student student2 = new Student("S12346", "Mathematics", 85);
        System.out.println("Student2 Batch: " + student2.getBatch());
        System.out.println("Student2 Course: " + student2.getCourse());
        System.out.println("Student2 PSP: " + student2.getPsp());

        System.out.println("DEBUG");
    }
}
