package labWork;

public class main {
    
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        // Using Calculator class from the same package
        int sum = labWork.Calculator.add(num1, num2);
        int difference = labWork.Calculator.subtract(num1, num2);
        int product = labWork.Calculator.multiply(num1, num2);
        double division = labWork.Calculator.divide(num1, num2);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Division: " + division);
    }
}
