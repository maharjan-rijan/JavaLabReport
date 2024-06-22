

// A Java program to demonstrate working on enum
// in switch case (Filename Test. Java)
 
// An Enum class
enum Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
}
 
// Driver class that contains an object of "day" and
// main().
public class Labenum {
    Day day;
 
    // Constructor
    public Labenum(Day day) { this.day = day; }
 
    // Prints a line about Day using switch
    public void dayIsLike()
    {
        
        switch (day) {
        case SUNDAY:
            System.out.println("First day of a week.");
            break;
        case MONDAY:
            System.out.println("Second day of a week.");
            break;
        case TUESDAY:
            System.out.println("Third day of a week.");
            break;
        case WEDNESDAY:
            System.out.println("Fourth day of a week.");
            break;
        case THURSDAY:
            System.out.println("Fifth day of a week.");
            break;
        case FRIDAY:
            System.out.println("Sixth day of a week.");
            break;
        case SATURDAY:
            System.out.println("Seventh day of a week.");
            break;
        default:
            System.out.println("There will be only 7 days in a week.");
            break;
        }
    }
 
    // Driver method
    public static void main(String[] args)
    {
        String str = "SATURDAY";
        Labenum t1 = new Labenum(Day.valueOf(str));
        t1.dayIsLike();
    }
}