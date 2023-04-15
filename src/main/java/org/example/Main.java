package org.example;

import java.util.ArrayList;

public class Main {

    // создаю продукты
    public static void main(String[] args) {
        Product product = new Product("Apple", 60, 8);
        Product product1 = new Product("Pear", 70, 7);
        Product product2 = new Product("Cucumber", 50, 6);
        Product product3 = new Product("Tomatoes", 60, 9);
        Product product4 = new Product("Pie", 150, 10);
        Product product5 = new Product("Waffle", 50, 5);

        // создаю категории
        Category fruit = new Category("fruit", new ArrayList());
        Category vegetable = new Category("vegetables", new ArrayList());
        Category candy = new Category("candy", new ArrayList());

        // создаю пользователей
        User user1 = new User("Vasya123", "10101", new Basket());
        User user2 = new User("Katya789", "123456", new Basket());
        User user3 = new User("Goshasha", "987456", new Basket());

        // вывожу список товоров в магазине по категориям
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

        // выводим логины пользователей и их продуктовые корзины
        System.out.println("\n Users and their baskets: ");
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println();
        // вася купил грушу
        user1.userBuySmth(product1, fruit);
        System.out.println(user1);
        System.out.println();

        //магазин немного опустел
        // вывожу список товоров в магазине по категориям
        System.out.println("\n The Store has: ");
        System.out.println(fruit);
        System.out.println(vegetable);
        System.out.println(candy);
        System.out.println();

        // вася еще купил помидорки, и катя купила пирог
        user1.userBuySmth(product3, vegetable);
        System.out.println(user1);
        user2.userBuySmth(product4, candy);
        System.out.println(user2);
        System.out.println();

        //магазин еще немного опустел
        // вывожу список товоров в магазине по категориям
        System.out.println("\n The Store has: ");
        System.out.println(fruit);
        System.out.println(vegetable);
        System.out.println(candy);
        System.out.println();


    }
}