import java.math.BigDecimal;
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Welcome to the Pi calculator!");
    
        if (args.length < 1) {
            System.out.println("Please provide the number of digits of Pi to display as an argument.");
            System.exit(1);
        }
    
        int numberOfDigits;
        try {
            numberOfDigits = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide a valid number.");
            System.exit(1);
            return;
        }
    
        PiCalculator calculator = new PiCalculator();
        System.out.println(calculator.calculatePi(numberOfDigits));
    }
    
}
