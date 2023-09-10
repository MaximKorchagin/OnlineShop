package org.example;

import java.util.List;

public class OnlineShop {
    public Basket getBasket() {
        return order.getBasket();
    }
    public Order getOrder() {
        return order;
    }
    Order order = new Order();

    public DeliverySystem getDeliverToAddress() {
        return deliverToAddress;
    }

    DeliverySystem deliverToAddress = new DeliverToAddress();

    ProductsJsonParser productsJsonParser = new ProductsJsonParser();
    private final List<Product> productList = productsJsonParser.getProductsFromJson("src/main/resources/productsInfo.json");

    public List<Product> getProductList() {
        return productList;
    }

    public void checkOut(String address) {
        Basket basket = order.getBasket();
        int payment = 0;
        for (int i = 0; i < basket.getProductBasket().size(); i++) {
            payment += basket.getProductBasket().get(i).getPrice();
        }
        System.out.println("Total: " + payment + " rub.");
        deliverToAddress.deliver(address, order);

    }


}
