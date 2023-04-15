package org.example;

import java.util.ArrayList;

public class Basket {
    protected ArrayList<String> listOfPurchasedGoods;

    public Basket(ArrayList<String> listOfPurchasedGoods) {
        this.listOfPurchasedGoods = listOfPurchasedGoods;
    }

    public Basket() {
        if (listOfPurchasedGoods == null) {
            this.listOfPurchasedGoods = new ArrayList<>();
            this.listOfPurchasedGoods.add("empty");
        }

    }

    /**
     * @param category - категория покупаемого продукта
     * @param product - то, что хочет купить пользователь
     * @return - список продуктов в корзине
     */
    public ArrayList<String> putProductsToBasket(Category category, Product product) {
            this.listOfPurchasedGoods.add(product.getProductName());
            this.listOfPurchasedGoods.remove("empty");
            category.deleteProducts(product);

        return listOfPurchasedGoods;
    }

    @Override
    public String toString() {
        return "" +  listOfPurchasedGoods;
    }

    public ArrayList<String> getListOfPurchasedGoods() {
        return listOfPurchasedGoods;
    }

    public void setListOfPurchasedGoods(ArrayList<String> listOfPurchasedGoods) {
        this.listOfPurchasedGoods = listOfPurchasedGoods;
    }
}
