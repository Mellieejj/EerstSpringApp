package com.example.demo.endpoints;
import com.example.demo.controller.PlantService;
import com.example.demo.domein.Plant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PlantEndPoints {
    @Autowired
    PlantService ps;

    @CrossOrigin
    @GetMapping("/alleplanten")
    public Iterable<Plant> ffproberen() {
        return ps.haalAllePlantenOp();
    }
    @CrossOrigin
    @PostMapping("/voegplanttoe")
    public void voegPlantToe(@RequestBody Plant plant){
        ps.postPlant(plant);
        System.out.println("voeg plant toe: " +plant.getNaam() );
    }
}
