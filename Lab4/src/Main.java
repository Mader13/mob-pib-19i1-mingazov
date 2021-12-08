
import GoodsSystem.Catalog;
import GoodsSystem.Goods;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Catalog listOfGoods = new Catalog();
        for (Goods list : listOfGoods.getGoodsList()) {
            System.out.println(list);
        }
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert customer ID");
        int id = 0;
        while  (!sc.hasNextInt()){
            System.out.println("Please, write correct customer ID");
            sc.next();
        };
        Customer customer = new Customer(id);
        System.out.println("Info about customer:");
        System.out.println(customer.showCustomerInfo());

        System.out.println("Add goods in shopping cart. If you don't want to buy, then type end");
        ShoppingCart shoppingCart = new ShoppingCart();
        do {
            shoppingCart.addToShoppingCart(sc.nextLine());
        } while (shoppingCart.endPurchases);
        payByCheck(shoppingCart.finalPrice, shoppingCart.sizeOfSale);


    }


    public static void payByCheck(double finalPrice, double sizeOfSale) {
        System.out.println("Your price ratio  = " + sizeOfSale);
        System.out.println("Your final price = " + finalPrice + " rubles");
        System.out.println("Thank you for purchase");
    }


}


