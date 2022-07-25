package org.example;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LogbackdemoApplicationTests {
//    private static Log log = LogFactory.getLog(LogbackdemoApplicationTests.class);
    @Test
    public void contextLoads() {
        log.info("输出info");
        log.debug("输出debug");
        log.error("输出error");
    }
}
