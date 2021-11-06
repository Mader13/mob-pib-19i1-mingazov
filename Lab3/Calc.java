import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String example = input.nextLine();
        String[] digitsStr = example.split(" ");
        double num1 = Double.parseDouble(digitsStr[0]);
        double num2 = Double.parseDouble(digitsStr[2]);
        double result = calculateResult(num1, num2, digitsStr);
        checkCorrectnessOrPrintResult(result);
    }

    public static void checkCorrectnessOrPrintResult(double result) {
        if (Double.isNaN(result)) {
            System.out.println("Error. Not a Number");
        } else {
            System.out.println(result);
        }
    }

    public static double calculateResult(double num1, double num2, String[] digitsStr) {
        switch (digitsStr[1]) {
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