package org.example;


import java.util.ArrayList;

public class Category {
    private String categoryName;
    protected ArrayList productList;


    public Category(String categoryName, ArrayList productList) {
        this.categoryName = categoryName;
        this.productList = productList;
    }

    public Category() {
    }

    /**
     * @param product - продукт, который нужно удалить из магазина
     * @return - измененный список продуктов в магазине
     */
    public ArrayList<String> deleteProducts(Product product) {
        this.productList.remove(product.getProductName());
        return productList;
    }

    /**
     * @param product - продукт который нужно добавить в магазин
     * @return - измененный список продуктов в магазине
     */
    public ArrayList<String> putProductInCategory(Product product) {
        this.productList.add(product.getProductName());

        return productList;
    }
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public ArrayList getProductList() {
        return productList;
    }

    public void setProductList(ArrayList productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "Category " + categoryName +
                " contains: " + productList;
    }

}
