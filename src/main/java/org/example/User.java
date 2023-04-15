package org.example;

import java.util.Arrays;

public class User {
    protected String login;
    private String password;
    private Basket userBasket;

    public User(String login, String password, Basket userBasket) {
        this.login = login;
        this.password = password;
        this.userBasket = userBasket;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User " +
                "login: " + login +
                 "\nUser basket: " + userBasket;
    }

    /**
     * @param product - покупаемый продукт
     * @param category - категория продукта
     */
    public void userBuySmth(Product product, Category category) {
        this.userBasket.putProductsToBasket(category, product);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
