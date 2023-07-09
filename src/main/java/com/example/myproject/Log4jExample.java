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

[default]
aws_access_key_id = AKIA2OGYBAH6QVD3S6I5
aws_secret_access_key = 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
output = json
region = us-east-2
