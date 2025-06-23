package singletonPattern.service;

import singletonPattern.generator.UniqueIdService;

public class UserService {
    public void registerUser() {
        String userId = UniqueIdService.getInstance().nextId();
        System.out.println("Registered user " + userId);
    }
}
