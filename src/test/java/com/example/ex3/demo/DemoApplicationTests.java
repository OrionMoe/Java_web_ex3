package com.example.ex3.demo;

import java.util.Optional;

import com.example.ex3.demo.entity.User;
import com.example.ex3.demo.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private UserRepository repository;

    @Test
    public void test() {
        Optional<User> u = repository.findById(4L);
        Assertions.assertTrue(u.isPresent());
        Assertions.assertEquals("Bort", u.get().getName());
    }
}
