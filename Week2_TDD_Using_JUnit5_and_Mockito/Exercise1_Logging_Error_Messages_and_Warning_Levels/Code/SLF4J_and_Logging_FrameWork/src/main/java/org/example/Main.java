package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        logger.info("Application started");

        logger.warn("This is a warning: disk space is low");

        try{
            int result = 10/0;
        }catch(ArithmeticException e){
            logger.error("An error occurred while dividing: {}", e.getMessage(),e);
        }

        logger.info("Application finished");
    }
}