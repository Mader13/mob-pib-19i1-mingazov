import GoodsSystem.*;

import java.time.DayOfWeek;
import java.util.*;

public class ShoppingCart {
    ArrayList<String> purchases = new ArrayList<>();
    Catalog catalog = new Catalog();
    List<Goods> list = catalog.getGoodsList();
    private final Map<DayOfWeek, Double> salesDays;

    public ShoppingCart() {
        this.salesDays = new HashMap();
        this.salesDays.put(DayOfWeek.SUNDAY, 0.10);
        this.salesDays.put(DayOfWeek.SATURDAY, 0.15);
        getSale();
    }

    double sizeOfSale = 1;

    public double getSale() {
        DayOfWeek current = getCurrentDayOfWeek();
        Double mayBeSale = salesDays.get(current);
        if (mayBeSale != null) {
            sizeOfSale -= mayBeSale;
        }
        return sizeOfSale;
    }


    private DayOfWeek getCurrentDayOfWeek() {
        Random random = new Random();
        int numberOfDay = random.nextInt(DayOfWeek.values().length);
        return DayOfWeek.of(numberOfDay + 1);
    }


    double finalPrice = 0;
    boolean endPurchases = true;

    public void addToShoppingCart(String customerChoice) {

        switch (customerChoice) {
            case "0":
                finalPrice += (list.get(0).getPrice() * sizeOfSale);
                purchases.add(list.get(0).getGoodsName());
                break;
            case "1":
                finalPrice += (list.get(1).getPrice() * sizeOfSale);
                purchases.add(list.get(1).getGoodsName());
                break;
            case "2":
                finalPrice += (list.get(2).getPrice() * sizeOfSale);
                purchases.add(list.get(2).getGoodsName());
                break;
            case "end" :
                endPurchases = false;
                break;
            default:
                System.out.println("The specified product ID is not in the system. Try again");
                break;
        }

    }


}
