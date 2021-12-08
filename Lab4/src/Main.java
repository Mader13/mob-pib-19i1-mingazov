
import GoodsSystem.Catalog;
import GoodsSystem.Goods;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main  {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileOutputStream fileOutputStream = new FileOutputStream("info.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        try(objectOutputStream){
            Catalog listOfGoods = new Catalog();
            objectOutputStream.writeObject(listOfGoods);
            objectOutputStream.close();
            for (Goods list : listOfGoods.getGoodsList()) {
                System.out.println(list);
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }


        Scanner sc = new Scanner(System.in);

        System.out.println("Insert customer ID");
        int id = 0;
        while  (!sc.hasNextInt()){
            System.out.println("Please, write correct customer ID");
            sc.next();
        };
        try(objectOutputStream){
            Customer customer = new Customer(id);
            objectOutputStream.writeObject(customer);
            objectOutputStream.close();
            System.out.println("Info about customer:");
            System.out.println(customer.showCustomerInfo());
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }



        System.out.println("Add goods in shopping cart. If you don't want to buy, then type end");
        ShoppingCart shoppingCart = new ShoppingCart();
        try(objectOutputStream){
            objectOutputStream.writeObject(shoppingCart);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }

        do {
            shoppingCart.addToShoppingCart(sc.nextLine());
        } while (shoppingCart.endPurchases);
        payByCheck(shoppingCart.finalPrice, shoppingCart.sizeOfSale);


        System.out.println();
        System.out.println();
        System.out.println();

        Catalog newListOfGoods = new Catalog();
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("info.txt"))){
            newListOfGoods=((Catalog)ois.readObject());
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        for (Goods list : newListOfGoods.getGoodsList()) {
            System.out.println(list);
        }

        Customer newCustomer = new Customer(id);
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("info.txt"))){
            newCustomer=((Customer)ois.readObject());
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        System.out.println(newCustomer.toString());



        ShoppingCart newShoppingCart = new ShoppingCart();
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("info.txt")))
        {
            newShoppingCart=((ShoppingCart)ois.readObject());
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        System.out.println(newShoppingCart.sizeOfSale + " , " + newShoppingCart.finalPrice);

    }


    public static void payByCheck(double finalPrice, double sizeOfSale) {
        System.out.println("Your price ratio  = " + sizeOfSale);
        System.out.println("Your final price = " + finalPrice + " rubles");
        System.out.println("Thank you for purchase");
    }


}


