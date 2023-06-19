package com.example.myproject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jExample {
    private static final Logger LOGGER = LogManager.getLogger(Log4jExample.class);

    public static void main(String[] args) {
        LOGGER.info("This is an info message");
        LOGGER.error("This is an error message");
    }
}
