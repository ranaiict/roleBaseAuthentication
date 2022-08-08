package com.example.rolebasedauthorizationwithexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication /*(exclude = {SecurityAutoConfiguration.class})*/
public class RoleBasedAuthorizationWithExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(RoleBasedAuthorizationWithExampleApplication.class, args);
    }

}
