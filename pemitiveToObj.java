public class pemitiveToObj {
    public static void main(String[] args) {
    int intValue = 56;
    Integer integerObject = Integer.valueOf(intValue); // converting int to Integer

    double doubleValue = 3.14;
    Double doubleObject = Double.valueOf(doubleValue); // converting double to Double

    boolean booleanValue = true;
    Boolean booleanObject = Boolean.valueOf(booleanValue); // converting boolean to Boolean

    char charValue = 'S';
    Character charObject = Character.valueOf(charValue); // converting char to Character

    // Printing the converted objects
    System.out.println("Integer Object: " + integerObject);
    System.out.println("Double Object: " + doubleObject);
    System.out.println("Boolean Object: " + booleanObject);
    System.out.println("Character Object: " + charObject);
}
}
