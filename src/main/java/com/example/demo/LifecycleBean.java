package com.example.demo;

import com.example.loose.NotificationService;
import com.example.loose.UserService;
import org.springframework.stereotype.Component;


public class LifecycleBean {
    private NotificationService notificationService;

    public LifecycleBean(NotificationService notificationService) {
        System.out.println("Constructor called: Dependency Injected");
        this.notificationService = notificationService;
    }

    public void init() {
        System.out.println("init called: Bean Initialized");
        notificationService.send("Hello from init");
    }

    public void performTask() {
        System.out.println("Ready for use");
    }

    public void cleanUp() {
        System.out.println("cleanUp called");
    }

}
