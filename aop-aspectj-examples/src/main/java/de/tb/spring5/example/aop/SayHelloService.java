package de.tb.spring5.example.aop;

import org.springframework.stereotype.Service;

@Service
public class SayHelloService {

    public void sayHelloWorld() {
        System.out.println("Hello world!");
    }
}
