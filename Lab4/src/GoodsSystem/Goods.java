package GoodsSystem;

public class Goods {
    double price;
    int productID;
    String Name;

    public Goods(int productID, double price, String Name){
        this.productID = productID;
        this.price = price;
        this.Name = Name;
    }

    public String getGoodsName() {
        return Name;
    }

    public double getPrice(){
        return price;
    }

}
