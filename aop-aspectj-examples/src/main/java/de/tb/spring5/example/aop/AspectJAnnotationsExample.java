package de.tb.spring5.example.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AspectJAnnotationsExample {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        SayHelloService sayHelloService = (SayHelloService)ctx.getBean("sayHelloService");
        sayHelloService.sayHelloWorld();
    }
}
