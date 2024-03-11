package week3.comparable;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Joshua Valenzia", "IT", 5.9),
                new Student("Emily Davis", "EEE", 8.9),
                new Student("Marco May", "IT", 9.2),
                new Student("Megan Jones", "ARC", 8.7),
                new Student("Donald Lane", "IT", 9.1),
                new Student("Jessica Wilson", "IT", 7.8),
                new Student("Luke Ortiz", "EEE", 5.6),
                new Student("Sarah Johnson", "IT", 10),
                new Student("Yasin Nielsen", "ARC", 8.3),
                new Student("Rebecca Miller", "EEE", 6.9)
        };

        /* Sort the students according to GPA */
		BubbleSort.sort(students);

        /* Print out the sorted students */
        for (Student s: students) {
            System.out.println(s.fullName + "\t|\t" + s.department + "\t|\t" + s.gpa);
        }
    }
}
