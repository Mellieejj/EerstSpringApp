package com.example.demo.controller;

import com.example.demo.domein.Plant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlantService {
    @Autowired
    PlantRepository pr;
    public Iterable<Plant> haalAllePlantenOp(){
        return pr.findAll();
    }

    public void postPlant(Plant plant){
        pr.save(plant);
    }
}
