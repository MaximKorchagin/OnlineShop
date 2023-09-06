package org.example;

public class Main {
    public static void main(String[] args) {
        Printer consolePrinter = new ConsolePrinter();
        OnlineShop shop = new OnlineShop();
        ProductFilter productFilter = new ProductFilter();
        consolePrinter.print(shop.getProductList());
        consolePrinter.print(productFilter.filterByWord("Pants", shop.getProductList()));
        consolePrinter.print(productFilter.filterByPriceRange(4000, 9000, shop.getProductList()));
    }
    //todo
    //test comment





}