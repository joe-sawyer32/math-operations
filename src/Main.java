import java.util.Scanner;

/**
 * Created by Joe on 7/17/17.
 */
public class Main {
    public static void main(String[] args) {
        double firstNum = getNumber();
        double secondNum = getNumber();
        showResults(firstNum, secondNum);
    }

    private static void showResults(double operand1, double operand2) {
        double sum = operand1 + operand2;
        System.out.println("The result from addition is: " + sum);
        double difference = operand1 - operand2;
        System.out.println("The result from subtraction is: " + difference);
        double multiplication = operand1 * operand2;
        System.out.println("The result from multiplication is: " + multiplication);
        double division = operand1 / operand2;
        System.out.println("The result from division is: " + division);
        double remainder = operand1 % operand2;
        System.out.println("The remainder from division is: " + remainder);
    }

    private static double getNumber() {
        System.out.println("Please enter a number:");
        Scanner scanner = new Scanner(System.in);
        double userInput;
        while (true) {
            try {
                userInput = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e){
                System.out.println(e.getMessage() + " -- Invalid Input");
            }
        }

        return userInput;
    }
}
