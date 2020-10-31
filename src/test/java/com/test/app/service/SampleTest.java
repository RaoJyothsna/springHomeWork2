package com.test.app.service;

import com.example.spring.service.CityService;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SampleTest {

    @Autowired
    private CityService cityService;

    @Test
    public void testCityServiceNotNull() {
        Assertions.assertNotNull(cityService);
    }
}
