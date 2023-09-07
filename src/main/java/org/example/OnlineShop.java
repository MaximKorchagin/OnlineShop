package org.example;

import java.util.List;

public class OnlineShop {
    Basket basket = new Basket();
    public Basket getBasket() {
        return basket;
    }
    //private final static String shopName = "My marketplace";

    ProductsJsonParser productsJsonParser = new ProductsJsonParser();
    private final List<Product> productList = productsJsonParser.getProductsFromJson("src/main/resources/productsInfo.json");

    public List<Product> getProductList() {
        return productList;
    }

    public int checkOut(Basket basket) {
        int payment = 0;
        for (int i = 0; i < basket.getProductBasket().size(); i++) {
            payment += basket.getProductBasket().get(i).getPrice();
        }
        return payment;
    }


}
