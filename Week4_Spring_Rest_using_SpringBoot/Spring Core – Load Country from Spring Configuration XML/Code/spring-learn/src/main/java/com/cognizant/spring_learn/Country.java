package com.cognizant.spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {

    private String code;
    private String name;

    private final Logger logger = LoggerFactory.getLogger(Country.class);

    public Country(){
        logger.info("inside the country constructor");
    }

    public String getCode() {
        logger.info("inside getter of : " + code);
        return code;
    }

    public void setCode(String code) {
        logger.info("inside getter of : " + name);
        this.code = code;
    }

    public String getName() {
        logger.info("inside getter of : " + name);
        return name;
    }

    public void setName(String name) {
        logger.info("inside setter of : " + name);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "code :'" + code + '\'' +
                ", name :'" + name + '\'' +
                '}';
    }
}

