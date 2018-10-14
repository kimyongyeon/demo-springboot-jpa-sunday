package com.example.demojpatestsunday;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.StopWatch;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoJpaTestSundayApplication implements CommandLineRunner {

    @RequestMapping(value = "/")
    public String index() {
        return "hello jpa welcome to sunday";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoJpaTestSundayApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println("hello service");
        for(var i=0; i<10000; i++) {
            System.out.println("======");
        }
        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());
    }
}
