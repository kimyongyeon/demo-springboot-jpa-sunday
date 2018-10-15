package com.example.demojpatestsunday;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

import java.util.List;

@Repository
public class SampleService {
    @Autowired
    SampleRepository sampleRepository;

    public Mono<List<SampleDTO>> getSampleList() {
        return Mono.just(sampleRepository.findAll());
    }

    public void save(SampleDTO sampleDTO) {
        sampleRepository.save(sampleDTO);
    }
}
