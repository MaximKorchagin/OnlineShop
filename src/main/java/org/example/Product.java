package org.example;

import java.util.Objects;

public class Product {
    private enum productType {COMPUTER_PART, HOUSEHOLD_PRODUCT, CLOTH, SPORT_PRODUCT}

    public Product(String productName, int price, int vendorCode, double rating, productType type) {
        this.productName = productName;
        this.price = price;
        this.vendorCode = vendorCode;
        this.rating = rating;
        this.type = type;
    }

    private final String productName;
    private final int price;
    private final int vendorCode;
    private final double rating;
    productType type;

    public String getProductName() {
        return productName;
    }

    public int getPrice() {
        return price;
    }

    public int getVendorCode() {
        return vendorCode;
    }

    public double getRating() {
        return rating;
    }

    public productType getType() {
        return type;
    }

    @Override
    public String toString() {
        return
                "\nproductName='" + productName + '\'' +
                        ", price=" + price +
                        ", vendorCode=" + vendorCode +
                        ", rating=" + rating +
                        ", productType=" + type +
                        '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return vendorCode == product.vendorCode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(vendorCode);
    }

}
