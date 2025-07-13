package com.cognizant.spring_learn.service;

import com.cognizant.spring_learn.dto.Country;
import com.cognizant.spring_learn.dto.CountryList;
import com.cognizant.spring_learn.exception.CountryNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryList countryList;

    public Country getCountry(String code){
        List<Country> list = countryList.getCountryList();
        for(Country country : list){
            if(country.getCode().equalsIgnoreCase(code)) return country;
        }
        throw new CountryNotFoundException();
    }
}
