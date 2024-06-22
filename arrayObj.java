public class arrayObj {
    public static void main(String[] args) {
        // Creating an array of Person objects
        Person[] people = new Person[3];
        // Initializing objects and adding them to the array
        people[0] = new Person("Rijan", 25);
        people[1] = new Person("Suhana", 30);
        people[2] = new Person("Rahul", 28);

        // Accessing and printing information from the array of objects
        for (Person person : people) {
            System.out.println("Name: " + person.getName() + "\n Age: " + person.getAge());
        }
    }
}

// Person class for demonstration
class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
