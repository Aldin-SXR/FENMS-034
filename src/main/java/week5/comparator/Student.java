package week5.comparator;

public class Student implements Comparable<Student> {
    public String fullName;
    public String department;
    public double gpa;

    /* Constructor: set initial values of the Student object */
    public Student(String fullName, String department, double gpa) {
        this.fullName = fullName;
        this.department = department;
        this.gpa = gpa;
    }

    /* Compare "this" student to "that" student (the other object) */
    public int compareTo(Student that) {								// 1
        if (this.gpa > that.gpa) {										// 2
            return 1;													// 2
        } else if (this.gpa < that.gpa) {								// 3
            return -1;													// 3
        } else {														// 4
            return 0;													// 4
        }
    }
}
