import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String example = input.nextLine();
        String[] digitsStr = example.split(" ");
        double num1 = Double.parseDouble(digitsStr[0]);
        double num2 = Double.parseDouble(digitsStr[2]);
        String operationStr = digitsStr[1];
        char operation = operationStr.charAt(0);
        Double result = calculateResult(num1, num2, operation);
        checkCorrectnessOrPrintResult(result);
    }

    public static void checkCorrectnessOrPrintResult(double result) {
        if (Double.isFinite(result)) {
            System.out.println(result);
            
        } else {
            System.out.println("Error. Insert other numbers");
        }
        
    }

    public static double calculateResult(double num1, double num2, char operation) {
        switch (operation) {
            case ("+"):
                return num1 + num2;
            case ("-"):
                return num1 - num2;
            case ("/"):
                return num1 / num2;
            case ("*"):
                return num1 * num2;
            default:
                System.out.println("Error. There is no such operation");
                break;
        }
        return 0;
    }
}