package org.example;

import java.util.List;

public class BasketConsolePrinter implements Printer {
    @Override
    public void print(List<Product> list) {
        System.out.println("Your product basket:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("[" + (i+1) + "] " + list.get(i).getProductName() + " - " + list.get(i).getPrice() + " rub.");
        }
    }
}
