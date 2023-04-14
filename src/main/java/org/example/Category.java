package org.example;


import java.util.ArrayList;
import java.util.Arrays;

public class Category {
    private String categoryName;
    private ArrayList productList;


    public Category(String categoryName, ArrayList productList) {
        this.categoryName = categoryName;
        this.productList = productList;
    }

    public Category() {
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

    // написать метод который кладет в категорию продукт
    public ArrayList<String> putProductInCategory(Product product) {
        this.productList.add(product.getProductName());

        return productList;
    }

    @Override
    public String toString() {
        return "Category " + categoryName +
                " contains: " + productList;
    }

}
