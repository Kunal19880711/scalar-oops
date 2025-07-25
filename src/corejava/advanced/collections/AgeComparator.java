package corejava.advanced.collections;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        // Compare ages directly
        return -Integer.compare(s1.getAge(), s2.getAge());
    }
}
