package com.codesnippet.tutorial;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
// @Primary // This annotation is used to mark this class as the primary bean when there are multiple candidates for autowiring.
public class OfflineOrder implements Order {
    
    public void processOrder() {
        System.out.println("Processing offline order...");
    }
}
