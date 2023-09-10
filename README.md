# S
[Link](/src/main/java/org/example/ProductFilter.java) - ProductFilter, класс, выполняющий свою единственную функцию - фильтрация продуктов
```
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
```
# O
- [Link](/src/main/java/org/example/DeliverySystem.java) - DeliverySystem - интерфейс
- [Link](/src/main/java/org/example/DeliverToAddress.java) - DeliverToAddress - класс, имплементирующий интерфейс DeliverySystem
- При желании, мы можем создать еще один класс, DeliveryToPVZ, например, который будет заниматься не курьерской доставкой, а доставкой в пункт выдачи, также имплепентирующий интерфейс DeliverySystem
```
package org.example;

public interface DeliverySystem {

    void deliver (String address, Order order); //todo
    void getStatus();
}
```
```
package org.example;

public class DeliverToAddress implements DeliverySystem {

    public enum DeliveryStatus {PACKAGING, WAITING_FOR_COURIER, DELIVERING, DONE}
    DeliveryStatus deliveryStatus;
    @Override
    public void deliver(String address, Order order) {
        System.out.println("dostavka zakaza: [" + order.getOrderID() + "] po adresu: " + address);
        deliveryStatus = DeliveryStatus.PACKAGING;
        startTransitioningToCourier();
        startCourierDelivering();
        deliveryDone();
    }

    @Override
    public void getStatus() {
        System.out.println(deliveryStatus);
    }

    public void startTransitioningToCourier() {
        deliveryStatus = DeliveryStatus.WAITING_FOR_COURIER;
    }

    public void startCourierDelivering() {
        deliveryStatus = DeliveryStatus.DELIVERING;
    }
    public void deliveryDone() {
        deliveryStatus = DeliveryStatus.DONE;
    }

}
```
# D
```
Printer productListConsolePrinter  = new ProductListConsolePrinter();
Printer basketConsolePrinter = new BasketConsolePrinter();
DeliverySystem deliverToAddress = new DeliverToAddress();
```
