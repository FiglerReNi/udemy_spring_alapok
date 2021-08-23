package hu.tmx.spring.spring.util;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Logger {
     public static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(Logger.class);
}
