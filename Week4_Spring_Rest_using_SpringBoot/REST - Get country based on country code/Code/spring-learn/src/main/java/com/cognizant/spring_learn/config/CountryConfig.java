package com.cognizant.spring_learn.config;


import com.cognizant.spring_learn.dto.Country;
import com.cognizant.spring_learn.dto.CountryList;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;


@Configuration
public class CountryConfig {

    @Bean
    public CountryList getCountryList(){
        CountryList list = new CountryList();
        list.setCountryList(Arrays.asList(
                new Country("IN", "India"),
                new Country("US", "United States"),
                new Country("JP", "Japan"),
                new Country("DE", "Germany")
        ));
        return list;
    }

}
