package com.example.demo;

import com.example.loose.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        System.out.println("Starting Spring Application Context");
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//        // 2. Spring se apna Bean maango (XML wale id ke zariye)
////        GreetingService greetingService = (GreetingService) context.getBean("myBean");
//        GreetingService greetingService = context.getBean(GreetingService.class);
//
//        // 3. Method chalao
//        greetingService.sayHello();
//
//        UserService userService = (UserService) context.getBean("userServiceSMS");
//        userService.notifyHello("Whats' up");
//
////        UserService userServiceEmail = (UserService) context.getBean("userServiceEmail");
////        userServiceEmail.notifyHello("Whats' up");

        System.out.println("Retrieving LifecycleBean");
        LifecycleBean lifecycleBean = (LifecycleBean) context.getBean("lifecycleBean");

        lifecycleBean.performTask();

        System.out.println("Closing ApplicationContext");


    }
}
