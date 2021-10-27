
import GoodsSystem.ListOfGoods;
import SalesSystem.Sales;


import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        ListOfGoods listofgoods = new ListOfGoods();
        listofgoods.initGoods();

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert customer ID");
        int customerID = sc.nextInt();
        Customer customer = new Customer(customerID, Customer.isRegularCustomer());

        double sizeOfSale = Sales.checkForSale(customer.regularCustomer);

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addToShoppingCart(sizeOfSale);


    }
}


