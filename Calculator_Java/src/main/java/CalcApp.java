import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class CalcApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double valueOne;
        Double valueTwo;
        String operation;
        boolean continueExecution;
        try{
            do {
                System.out.println("Enter value one: ");
                valueOne = scanner.nextDouble();

                System.out.println("Enter the operation (+, -, /, *): ");
                operation = scanner.next();

                System.out.println("Enter value two: ");
                valueTwo = scanner.nextDouble();

                System.out.println("Result " + performCalculation(valueOne, valueTwo, operation));

                continueExecution = checkForNewOperation();
            } while (continueExecution);
        }catch (InputMismatchException ex){
            System.out.println("Calculation values must be numeric.");
        }


    }
    public static boolean checkForNewOperation(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to perform a new operation? (Y or N): ");
        return !sc.nextLine().toUpperCase(Locale.ROOT).equals("N");
    }
    public static Double performCalculation(Double valueOne, Double valueTwo, String operation){
        Double calculationResult = 0.0;

        switch(operation){
            case "+":
                calculationResult = valueOne + valueTwo;
                break;
            case "-":
                calculationResult = valueOne - valueTwo;
                break;
            case "*":
                calculationResult = valueOne * valueTwo;
                break;
            case "/":
                calculationResult = valueOne / valueTwo;
                break;
            default:
                System.out.println("Invalid operation");
        }

        return calculationResult;
    }
}
