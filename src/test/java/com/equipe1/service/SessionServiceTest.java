package com.equipe1.service;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class SessionServiceTest {

    @Autowired
    private SessionService sessionService;

    @Test
    void testGetCurrent() {

    }
}
