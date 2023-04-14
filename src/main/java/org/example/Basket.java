package org.example;

import java.util.Arrays;

public class Basket {
    private Arrays listOfPurchasedGoods;

    public Basket(Arrays listOfPurchasedGoods) {
        this.listOfPurchasedGoods = listOfPurchasedGoods;
    }

    public Basket() {
    }

    public Arrays getListOfPurchasedGoods() {
        return listOfPurchasedGoods;
    }

    public void setListOfPurchasedGoods(Arrays listOfPurchasedGoods) {
        this.listOfPurchasedGoods = listOfPurchasedGoods;
    }
}
