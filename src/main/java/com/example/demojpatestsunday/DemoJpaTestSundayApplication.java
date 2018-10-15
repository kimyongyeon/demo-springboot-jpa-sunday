package com.example.demojpatestsunday;

import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    SampleService sampleService;

    @RequestMapping(value = "/")
    public String index() {
        return "hello jpa welcome to sunday";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoJpaTestSundayApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        StopWatch stopWatch = new StopWatch();
//        stopWatch.start();
//        System.out.println("hello service");
//        for(int i=0; i<10000; i++) {
//            System.out.println("======");
//        }
//        stopWatch.stop();
//        System.out.println(stopWatch.prettyPrint());

        SampleDTO sampleDTO = new SampleDTO();
        sampleDTO.setMsg("success... ");
        sampleDTO.setMsgCode(1);
        sampleService.save(sampleDTO);

        sampleDTO = new SampleDTO();
        sampleDTO.setMsg("success...2 ");
        sampleDTO.setMsgCode(2);
        sampleService.save(sampleDTO);

        sampleDTO = new SampleDTO();
        sampleDTO.setMsg("success...3 ");
        sampleDTO.setMsgCode(3);
        sampleService.save(sampleDTO);
    }
}
