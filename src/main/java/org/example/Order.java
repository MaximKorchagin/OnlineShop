package org.example;


public class Order {

    private String address;
    private static final IDGenerator idGenerator = new IDGenerator();


    public Basket getBasket() {
        return basket;
    }

    public int getOrderID() {
        return orderID;
    }

    public Order() {
        this.basket = new Basket();
        this.orderID = idGenerator.nextID();
    }

    Basket basket;
    int orderID;
}
