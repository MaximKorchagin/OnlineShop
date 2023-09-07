package org.example;

public class Product {
    private enum productType {COMPUTER_PART, HOUSEHOLD_PRODUCT, CLOTH, SPORT_PRODUCT}

    public Product(String productName, int price, int vendorCode, double rating, productType type) {
        this.productName = productName;
        this.price = price;
        this.vendorCode = vendorCode;
        this.rating = rating;
        this.type = type;
    }

    private String productName;
    private int price;
    private int vendorCode;
    private double rating;
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

}
