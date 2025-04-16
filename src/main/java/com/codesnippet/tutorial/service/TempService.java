package com.codesnippet.tutorial.service;

import org.springframework.stereotype.Component;

@Component // This annotation indicates that this class is a Spring component and will be managed by the Spring container.
public class TempService {
    public String getMessage() {
        return "Hello from TempService!";
    }
}
