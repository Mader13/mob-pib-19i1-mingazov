import GoodsSystem.*;


import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart {
    ArrayList<String> purchases = new ArrayList<>();
    ListOfGoods listOfGoods = new ListOfGoods();
    ArrayList<Goods> list = listOfGoods.getGoodsList();
    double finalPrice = 0;
    double finalPriceWithSale = 0;

    public void addToShoppingCart(double sizeOfSale) {

        boolean endPurchases = true;

        Scanner sc = new Scanner(System.in);
        System.out.println("Add goods in shopping cart. If you don't want to buy, then press 5 for exit ");
        do {
            int buyingPosition = sc.nextInt();

            switch (buyingPosition) {
                case 0:
                    finalPrice += list.get(0).getPrice();
                    purchases.add(list.get(0).getGoodsName());
                    System.out.println();
                    break;
                case 1:
                    finalPrice += list.get(1).getPrice();
                    purchases.add(list.get(1).getGoodsName());
                    break;
                case 2:
                    finalPrice += list.get(2).getPrice();
                    purchases.add(list.get(2).getGoodsName());
                    break;
                case 5:
                    endPurchases = false;
                    break;
                default:
                    System.out.println("The specified product ID is not in the system. Try again");
                    break;
            }
        } while (endPurchases);

        finalPriceWithSale = finalPrice * sizeOfSale;
        payByCheck(finalPrice, sizeOfSale, finalPriceWithSale);

    }

    public void payByCheck(double finalPrice, double sizeOfSale, double finalPriceWithSale) {
        System.out.println("Shopping cart: ");
        for (int i = 0; i < purchases.size(); i++) {
            System.out.println(i + ". " + purchases.get(i) );
        }
        System.out.println("Your final price without sale = " + finalPrice + " rubles");
        System.out.println("Your sale = " + sizeOfSale);
        System.out.println("Your final price with sale = " + finalPrice + " * " + sizeOfSale + " = " + finalPriceWithSale);
        System.out.println("Thank you for purchase");
    }

}
