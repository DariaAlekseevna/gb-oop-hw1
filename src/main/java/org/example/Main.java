package org.example;

import java.util.ArrayList;

public class Main {

    // продукты
    public static void main(String[] args) {
        Product product = new Product("Apple", 60, 8);
        Product product1 = new Product("Pear", 70, 7);
        Product product2 = new Product("Cucumber", 50, 6);
        Product product3 = new Product("Tomatoes", 60, 9);
        Product product4 = new Product("Pie", 150, 10);
        Product product5 = new Product("Waffle", 50, 5);
        System.out.println(product);

        ArrayList<Product> arr = new ArrayList<>();

        // категории
        Category fruit = new Category("fruit", new ArrayList());
        Category vegetable = new Category("vegetables", new ArrayList());
        Category candy = new Category("candy", new ArrayList());

        // пользователи
        User user1 = new User("Vasya123", "10101", new Basket());
        User user2 = new User("Katya789", "123456", new Basket());
        User user3 = new User("Goshasha", "987456", new Basket());

        System.out.println("\n The Store has: ");
        fruit.putProductInCategory(product);
        fruit.putProductInCategory(product1);
        System.out.println(fruit);

        vegetable.putProductInCategory(product2);
        vegetable.putProductInCategory(product3);
        System.out.println(vegetable);

        candy.putProductInCategory(product4);
        candy.putProductInCategory(product5);
        System.out.println(candy);
    }
}