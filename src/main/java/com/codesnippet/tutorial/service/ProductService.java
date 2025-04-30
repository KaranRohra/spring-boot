package com.codesnippet.tutorial.service;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

/**
 * The ProductService class is a Spring service component that demonstrates
 * the lifecycle of a Spring bean. It includes methods annotated with 
 * {@link javax.annotation.PostConstruct} and {@link javax.annotation.PreDestroy} 
 * to handle initialization and destruction callbacks.
 * 
 * <p>Features:
 * <ul>
 *   <li>Logs a message when the constructor is called.</li>
 *   <li>Logs a message after the bean is created using the {@code @PostConstruct} annotation.</li>
 *   <li>Logs a message before the bean is destroyed using the {@code @PreDestroy} annotation.</li>
 * </ul>
 * 
 * <p>Note: The commented-out code demonstrates an alternative way to handle 
 * bean lifecycle callbacks by implementing the {@link org.springframework.beans.factory.InitializingBean} 
 * and {@link org.springframework.beans.factory.DisposableBean} interfaces.
 * 
 * <p>Usage:
 * <pre>
 * {@code
 * @Service
 * public class ProductService {
 *     // Bean lifecycle methods are automatically invoked by Spring.
 * }
 * }
 * </pre>
 */
@Service
public class ProductService { // implements InitializingBean, DisposableBean {
    public ProductService() {
        System.out.println("********************");
        System.out.println("ProductService constructor called.");
        System.out.println("********************");
    }

    // @Override
    // public void afterPropertiesSet() throws Exception {
    //     System.out.println("********************");
    //     System.out.println("ProductService afterPropertiesSet method called.");
    //     System.out.println("********************");
    // }

    // @Override
    // public void destroy() throws Exception {
    //     System.out.println("********************");
    //     System.out.println("ProductService destroy method called.");
    //     System.out.println("********************");
    // }

    @PostConstruct
    public void calledAfterBeanCreated() {
        System.out.println("********************");
        System.out.println("ProductService calledAfterBeanCreated method called.");
        System.out.println("********************");
    }

    @PreDestroy
    public void calledBeforeBeanDestroyed() {
        System.out.println("********************");
        System.out.println("ProductService calledBeforeBeanDestroyed method called.");
        System.out.println("********************");
    }
}
