package com.example.rolebasedauthorizationwithexample.service;

import com.example.rolebasedauthorizationwithexample.model.Role;
import com.example.rolebasedauthorizationwithexample.model.User;
import com.example.rolebasedauthorizationwithexample.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Collections;

@Component
@AllArgsConstructor
public class DbInit {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    //@PostConstruct
    public void initData(){
        Role role = new Role();
        role.setName("ADMIN");
        User user = new User();
        user.setUsername("rahim");
        user.setPassword(passwordEncoder.encode("123456"));
        user.setEnabled(true);
        user.setRoles(Collections.singleton(role));
        userRepository.save(user);
    }
}
