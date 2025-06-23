package singletonPattern;

import singletonPattern.service.OrderService;
import singletonPattern.service.UserService;

public class Main {
    public static void main(String[] args) {
        OrderService orderSvc = new OrderService();
        UserService userSvc = new UserService();

        orderSvc.createOrder();
        userSvc.registerUser();
        orderSvc.createOrder();
    }
}
