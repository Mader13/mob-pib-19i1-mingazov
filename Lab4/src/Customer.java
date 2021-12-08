import java.util.Random;
import java.util.Scanner;

public final class Customer {
    private final int id;
    private final boolean regular;

    public Customer(int id) {
        this.id = id;
        this.regular = isRegularCustomer();
    }

    private boolean isRegularCustomer() {
        return new Random().nextBoolean();
    }

    public int getID() {
        return id;
    }

    public boolean getRegular(boolean regular) {
        return regular;
    }

    public String showCustomerInfo() {
        return "Is " + id + " regular customer?" + " " + regular;
    }
}
