package singletonPattern.service;

import singletonPattern.generator.UniqueIdService;

public class OrderService {
    public void createOrder() {
        String orderId = UniqueIdService.getInstance().nextId();
        System.out.println("Created order " + orderId);
    }
}
