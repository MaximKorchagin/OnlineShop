package org.example;

import java.util.List;

public class OnlineShop {
    private final static String shopName = "My marketplace";
    ProductsJsonParser productsJsonParser = new ProductsJsonParser();
    private final List<Product> productList = productsJsonParser.getProductsFromJson("src/main/resources/productsInfo.json");

    public List<Product> getProductList() {
        return productList;
    }
}
