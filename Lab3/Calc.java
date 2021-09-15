import java.util.Scanner;

public class Calc {

    public static void main(String[] args){
        double num1, num2, result;

        Scanner input = new Scanner(System.in);
        String example = input.nextLine();
        String[] digitsStr = example.split(" ");
        num1 = Double.parseDouble(digitsStr[0]);
        num2 = Double.parseDouble(digitsStr[2]);

        switch (digitsStr[1]) {
            case ("+") :
                result = num1 + num2;
                correctnessOfResult(result);
                break;
            case ("-") :
                result = num1 - num2;
                correctnessOfResult(result);
                break;
            case ("/") :
                result = num1 / num2;
                correctnessOfResult(result);
                break;
            case ("*") :
                result = num1 * num2;
                correctnessOfResult(result);
                break;
            default:
                System.out.println("Error");
                break;
        }

    }
    public static void correctnessOfResult(double result) {
        if (Double.isNaN(result)){
            System.out.println("Error. Not a Number");
            return;
        }
        else {
            System.out.println(result);
            return;
        }
    }

}