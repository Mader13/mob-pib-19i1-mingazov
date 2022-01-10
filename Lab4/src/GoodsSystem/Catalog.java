package GoodsSystem;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Catalog implements Serializable {
    private static final long serialVersionUID = 3L;
    private final List<Goods> goodsList = new ArrayList<>();

    public Catalog() {
        goodsList.add(new Goods(0, 70, "Milk"));
        goodsList.add(new Goods(1, 50, "Bread"));
        goodsList.add(new Goods(2, 300, "Sausage"));
    }


    public List<Goods> getGoodsList() {
        return goodsList;
    }

}
