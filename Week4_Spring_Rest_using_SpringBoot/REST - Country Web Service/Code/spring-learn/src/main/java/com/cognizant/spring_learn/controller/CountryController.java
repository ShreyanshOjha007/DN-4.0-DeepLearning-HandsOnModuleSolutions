package com.cognizant.spring_learn.controller;

import com.cognizant.spring_learn.dto.Country;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CountryController {

    private static final ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

    @GetMapping("/country")
    public Country sayHello(){
         return (Country) context.getBean("india");
    }
}
