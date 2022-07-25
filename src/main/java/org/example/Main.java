package org.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        log.info("输出info");
        log.debug("输出debug");
        log.error("输出error");
        try{
            int a=0;
            int b=100/a;
        }catch (Exception e){
            log.error(e.getMessage());
        }
        System.out.println("Hello world!");
    }
}