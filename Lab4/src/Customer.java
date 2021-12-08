import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Random;
import java.util.Scanner;

public final class Customer implements Serializable {
    private static final long serialVersionUID = 4L;
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
