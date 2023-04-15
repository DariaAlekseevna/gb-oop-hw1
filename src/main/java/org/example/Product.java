package org.example;

public class Product {
    private String productName;
    private Integer price;
    private Integer rating;

    public Product(String productName, Integer price, Integer rating) {
        this.productName = productName;
        this.price = price;
        this.rating = rating;
    }

    public Product() {
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Product Name: " + productName + '\'' +
                ", price: " + price +
                ", rating: " + rating;
    }
}

