package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class ProductFilter {
    public List<Product> filterByWord(String word, List<Product> list) {
        System.out.println("Filtering products by name - " + "[" + word + "]...");
        return list.stream()
                .filter(product -> product.getProductName().contains(word))
                .collect(Collectors.toList());
    }

    public List<Product> filterByPriceRange(int minPrice, int maxPrice, List<Product> list) {
        System.out.println("Filtering products by price range - " + "[" + minPrice + " - " + maxPrice + "]" );
        return list.stream()
                .filter(product -> product.getPrice() < maxPrice && product.getPrice() > minPrice)
                .collect(Collectors.toList());
    }

}
