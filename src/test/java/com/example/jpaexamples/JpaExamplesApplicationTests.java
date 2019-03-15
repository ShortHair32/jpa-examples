package com.example.jpaexamples;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.example.jpaexamples.repository.*;

import org.springframework.beans.factory.annotation.Autowired;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaExamplesApplicationTests {
    @Autowired
    private UserRepository userRepository;
    @Test
    public void addAddressTest() {
        userRepository.addUserAddress();
    }
}

