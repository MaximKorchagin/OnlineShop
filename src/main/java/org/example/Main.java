package org.example;

import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        Printer consolePrinter = new ConsolePrinter();
        ProductFilter productFilter = new ProductFilter();
        ProductsJsonParser productsJsonParser = new ProductsJsonParser();
        List<Product> productList = productsJsonParser.getProductsFromJson("src/main/resources/productsInfo.json");
        consolePrinter.print(productList);
//        filterByWord("Pants", productList);
        consolePrinter.print(productFilter.filterByWord("Pants", productList));
        consolePrinter.print(productFilter.filterByPriceRange(4000, 9000, productList));
    }
    //todo





}