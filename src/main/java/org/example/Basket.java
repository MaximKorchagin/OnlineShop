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



}
