package designPatterns.prototype;

public class Client {
    public static void main(String[] args) {
        // object of type student
        Student student1 = new Student();
        student1.setName("John");
        student1.setAge(20);
        student1.setPsp(3.5f);
        student1.setId(1);

        AcademyStudent academicStudent1 = new AcademyStudent();
        academicStudent1.setName("Alice");
        academicStudent1.setAge(22);
        academicStudent1.setPsp(3.8f);
        academicStudent1.setIq(130);
        academicStudent1.setCourse("Computer Science");

        PrototypeRegistry<Student> registry = new PrototypeRegistry<>();
        registry.register("student1", student1);
        registry.register("academicStudent1", academicStudent1);

        // Create a copy of student1
        AcademyStudent student2 = academicStudent1.copy();

        AcademyStudent student3 = (AcademyStudent)registry.get("academicStudent1");
    }
}
