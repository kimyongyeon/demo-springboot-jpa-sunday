package com.example.demojpatestsunday;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StopWatch;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
public class SampleController {


    @Autowired
    SampleService sampleService;

    @RequestMapping("/insert")
    public String insert() {
        SampleDTO sampleDTO = new SampleDTO();
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for (int i=0; i<10000; i++) {
            sampleDTO = new SampleDTO();
            sampleDTO.setMsgCode(i);
            sampleDTO.setMsg("msg+" + i);
            sampleService.save(sampleDTO);
        }
        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());
        return "ok";
    }

    @RequestMapping("/sample")
    public String list() {
        Mono<List<SampleDTO>> list = sampleService.getSampleList();
        list.subscribe(l -> l.forEach(i -> System.out.println("code: " + i.getMsgCode() + "msg: " + i.getMsg())) );
        return "ok";
    }
}
