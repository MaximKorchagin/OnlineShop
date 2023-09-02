package org.example;

import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        ProductFilter productFilter = new ProductFilter();
        ProductsJsonParser productsJsonParser = new ProductsJsonParser();
        List<Product> productList = productsJsonParser.getProductsFromJson("src/main/resources/productsInfo.json");
        printProductsList(productList);
//        filterByWord("Pants", productList);
        printProductsList(productFilter.filterByWord("Pants", productList));
        printProductsList(productFilter.filterByPriceRange(4000, 9000, productList));
    }
    //todo



    public static void printProductsList(List<Product> list) {
        System.out.println("List of products available");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("[" + (i+1) + "] " + list.get(i).getProductName() + " - " + list.get(i).getPrice() + " rub.");
        }
    }


}