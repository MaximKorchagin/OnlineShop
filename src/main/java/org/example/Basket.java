package org.example;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private List<Product> productBasket = new ArrayList<>();

    public List<Product> getProductBasket() {
        return productBasket;
    }

    public void addProductToBasket(Product product) {
        productBasket.add(product);
    }

    public int checkOut(List<Product> productBasket) {
        int payment = 0;
        for (int i = 0; i < productBasket.size(); i++) {
            payment += productBasket.get(i).getPrice();
        }
        return payment;
    }


}
