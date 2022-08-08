package com.example.rolebasedauthorizationwithexample.repository;

import com.example.rolebasedauthorizationwithexample.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
