package designPatterns.prototype;

public class AcademyStudent extends Student {
    private int iq;
    private String course;

    public AcademyStudent() {
        super();
    }

    public AcademyStudent(AcademyStudent student) {
        super(student);
        this.iq = student.iq;
        this.course = student.course;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public AcademyStudent copy() {
        return new AcademyStudent(this);
    }
}
