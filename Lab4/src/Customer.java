import java.util.Random;
import java.util.Scanner;

public class Customer {
    int customerID;
    boolean regularCustomer;

    public Customer(int customerID, boolean regularCustomer) {
        isRegularCustomer();
        this.customerID = customerID;
        this.regularCustomer = regularCustomer;
        showCustomerInfo(customerID, regularCustomer);
    }

    protected static boolean isRegularCustomer(){
        Random rand = new Random();
        boolean regularCustomer;
        regularCustomer = rand.nextBoolean();
        return regularCustomer;
    }


    public static void showCustomerInfo(int customerID, boolean regularCustomer) {
        System.out.println("Is " + customerID + " regular customer?" + " " + regularCustomer);
    }

}
