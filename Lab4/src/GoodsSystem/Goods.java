package GoodsSystem;

public class Goods {
    private double price;
    private int id;
    private final String name;

    public Goods(int id, double price, String name){
        this.id = id;
        this.price = price;
        this.name = name;
    }

    public String getGoodsName() {
        return name;
    }

    public double getPrice(){
        return price;
    }

    public double getId(){
        return id;
    }


    public void setPrice(){
        this.price = price;
    }

    public void setId(){
        this.id = id;
    }
    @Override
    public String toString() {
        return " Item " + id + ", " + "Price: " + price + ", " + name + "\n";
    }


}
