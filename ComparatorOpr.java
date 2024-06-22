import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Define a Student class
class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class ComparatorOpr {
    public static void main(String[] args) {
        // Create a list of Student objects
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ram", 20));
        students.add(new Student("Syam", 22));
        students.add(new Student("Chandra", 19));
        students.add(new Student("Manish", 21));

        // Display the list before sorting
        System.out.println("List of Students before sorting:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Create a Comparator to sort students by name
        Comparator<Student> nameComparator = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        };

        // Sort the list using Comparator
        Collections.sort(students, nameComparator);

        // Display the list after sorting
        System.out.println("\nList of Students after sorting by name:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
