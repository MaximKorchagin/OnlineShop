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
