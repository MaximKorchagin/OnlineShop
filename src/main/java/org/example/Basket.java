package org.example;

import java.util.*;

public class Basket {

    Map<Product, Integer> map = new HashMap<>();

    public void addProductToBasket(Product product) {
        if (map.containsKey(product)) {
            map.put(product, map.get(product) + 1);
        } else {
            map.put(product, 1);
        }
    }

    public List<Product> getProductBasket() {
        List<Product> temp = new ArrayList<>();
        for (Map.Entry<Product, Integer> pos : map.entrySet()) {
            for (int i = 0; i < pos.getValue(); i++) {
                temp.add(pos.getKey());
            }
        }
        return temp;
    }

}
