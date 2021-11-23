package GoodsSystem;

import java.util.ArrayList;
import java.util.List;

public class ListOfGoods {
    private static ArrayList<Goods> goodsList;

    public static void initGoods() {
        ListOfGoods listOfGoods = new ListOfGoods();
        listOfGoods.createGoods();
        displayGoods();
    }

    public static void createGoods() {
        goodsList = new ArrayList<Goods>();
        Goods id0 = new Goods(0, 70, "Milk");
        Goods id1 = new Goods(1, 50, "Bread");
        Goods id2 = new Goods(2, 300, "Sausage");
        goodsList.add(id0);
        goodsList.add(id1);
        goodsList.add(id2);
    }

    public static void displayGoods() {
        for(Goods list : goodsList) {
            System.out.println(list.productID + " / " + list.Name + " / " + list.price);
        }
    }




    public ArrayList<Goods> getGoodsList(){
        return goodsList;
    }

}
