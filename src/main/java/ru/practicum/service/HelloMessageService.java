package ru.practicum.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class HelloMessageService {

    private final String message;

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    public HelloMessageService(@Value("${message2:Hello!}") String message) {
        this.message = message;
    }

    public String getMessage() {
        logger.info("Got message = {}", message);
        return message;
    }
}
