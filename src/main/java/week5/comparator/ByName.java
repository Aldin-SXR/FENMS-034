package week5.comparator;

import java.util.Comparator;

public class ByName implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.fullName.compareTo(s2.fullName);
    }
}
