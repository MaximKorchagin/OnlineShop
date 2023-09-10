package org.example;

public class Main {
    public static void main(String[] args) {
        Printer productListConsolePrinter  = new ProductListConsolePrinter();
        OnlineShop shop = new OnlineShop();
        ProductFilter productFilter = new ProductFilter();
        Printer basketConsolePrinter = new BasketConsolePrinter();
        productListConsolePrinter.print(shop.getProductList());
        productListConsolePrinter.print(productFilter.filterByWord("Pants", shop.getProductList()));
        productListConsolePrinter.print(productFilter.filterByPriceRange(4000, 9000, shop.getProductList()));

        shop.getBasket().addProductToBasket(shop.getProductList().get(2));
        shop.getBasket().addProductToBasket(shop.getProductList().get(2));
        shop.getBasket().addProductToBasket(shop.getProductList().get(3));
        shop.getBasket().addProductToBasket(shop.getProductList().get(3));
        basketConsolePrinter.print(shop.getBasket().getProductBasket());
        shop.checkOut(shop.getBasket());
    }

}