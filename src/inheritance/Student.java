package inheritance;

public class Student extends User {
    private String batch;
    private String course;
    private int psp;

    public Student(String userId, String name, String batch, String course, int psp) {
        super(userId, name);
        this.batch = batch;
        this.course = course;
        this.psp = psp;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getPsp() {
        return psp;
    }

    public void setPsp(int psp) {
        this.psp = psp;
    }
}