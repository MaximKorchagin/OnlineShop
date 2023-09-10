package org.example;

public class DeliverToAddress implements DeliverySystem {

    @Override
    public void deliver(String address, Order order) { //todo
        System.out.println("dostavka zakaza: [" + order.getOrderID() + "] po adresu: " + address);
    }
}
