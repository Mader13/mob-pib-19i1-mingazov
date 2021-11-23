package SalesSystem;
import java.util.Random;

public class Sales {
    SalesDays SalesDays;
    public static String dayOfWeek = null;

    public static double checkForSale(boolean regularCustomer) {
        SalesDays[] saleDays = SalesSystem.SalesDays.values();
        Random rand = new Random();
        int currentDay = rand.nextInt(7);

        double sizeOfSale = 1;
        switch (currentDay) {
            case 0:
                dayOfWeek = "MONDAY";
                break;
            case 1:
                dayOfWeek = "TUESDAY";
                break;
            case 2:
                dayOfWeek = "WEDNESDAY";
                break;
            case 3:
                dayOfWeek = "THURSDAY";
                break;
            case 4:
                dayOfWeek = "FRIDAY";
                break;
            case 5:
                dayOfWeek = "SATURDAY";
                break;
            case 6:
                dayOfWeek = "SUNDAY";
                break;
            default:
                System.out.println("ERROR");
                break;
        }


        if (dayOfWeek.equals(saleDays[0].toString()) || dayOfWeek.equals(saleDays[1].toString())) {
            sizeOfSale -= 0.05;
        }
        if (regularCustomer) {
            sizeOfSale -= 0.10;
        }
        showSaleStatus(sizeOfSale, regularCustomer);
        return sizeOfSale;
    }

    public static void showSaleStatus(double sizeOfSale, boolean regularCustomer){
        System.out.println("Day of week: " + Sales.dayOfWeek);
        System.out.println("Size of sale: " + sizeOfSale);
    }

}
