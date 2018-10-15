package com.example.demojpatestsunday;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SampleRepository extends JpaRepository<SampleDTO, Long> {
}
