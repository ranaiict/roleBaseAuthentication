package com.example.rolebasedauthorizationwithexample.repository;


import com.example.rolebasedauthorizationwithexample.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Long> {

   // @Query(value = "SELECT u FROM User u WHERE u.username = :username", nativeQuery = true)
   @Query("SELECT u FROM User u WHERE u.username = ?1")
    public User getUserByUsername(@Param("username") String username);
}
