package org.muyun.dubbopractive.consumer;

import org.apache.dubbo.config.annotation.DubboReference;
import org.muyun.dubbopractive.TimeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

    @RestController
    public static class IndexController {

        @DubboReference
        private TimeService timeService;

        @GetMapping("/getTime")
        public void getTime() {
            System.out.println(timeService.getCurrentTime());
        }

    }
}
