package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    public  void checkout(String status) {
        // cross cutting concerns like Logging, Authentication, Authorization are handled with Aspects
        System.out.println("Checkout method from ShoppingCart called");
    }
}
