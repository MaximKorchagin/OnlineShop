package org.example;

public class Main {
    public static void main(String[] args) {
        Printer productListConsolePrinter = new ProductListConsolePrinter();
        Printer basketConsolePrinter = new BasketConsolePrinter();
        OnlineShop shop = new OnlineShop();
        ProductFilter productFilter = new ProductFilter();
        productListConsolePrinter.print(shop.getProductList());
        productListConsolePrinter.print(productFilter.filterByWord("Pants", shop.getProductList()));
        productListConsolePrinter.print(productFilter.filterByPriceRange(4000, 9000, shop.getProductList()));

        System.out.println("=================================");
        shop.getBasket().addProductToBasket(shop.getProductList().get(2));
        shop.getBasket().addProductToBasket(shop.getProductList().get(3));
        basketConsolePrinter.print(shop.getBasket().getProductBasket());
        System.out.println(shop.checkOut(shop.basket));
    }

}