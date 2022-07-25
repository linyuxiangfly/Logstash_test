package org.example;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class Main {
//    private static Log log = LogFactory.getLog(Main.class);
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        log.info("输出info");
        log.debug("输出debug");
        log.error("输出error");
        System.out.println("Hello world!");
    }
}