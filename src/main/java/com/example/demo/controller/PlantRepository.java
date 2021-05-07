package com.example.demo.controller;

import com.example.demo.domein.Plant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface PlantRepository extends CrudRepository<Plant, Long> {

}
