package com.example.ex3.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.RestController;

import com.example.ex3.demo.entity.User;
import com.example.ex3.demo.repository.UserRepository;
  
@RestController  
public class UserController {  
  
  @Autowired  
  private UserRepository userRepository;
  
  @GetMapping("/user/{id}")
  public Optional<User> findById(@PathVariable Long id) {  
    return this.userRepository.findById(id);  
  }  
}  
