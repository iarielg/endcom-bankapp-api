package com.endcombankappapi.demo.controller;

import com.endcombankappapi.demo.MovementService;
import com.endcombankappapi.demo.model.Movement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movement/")
@CrossOrigin("*")
public class MovementController {
    private final MovementService movementService;
    @Autowired
    public MovementController(MovementService movementService){
        this.movementService = movementService;
    }//constructor
    @GetMapping
    public List<Movement> getAllMovement(){
        return movementService.getAllMovement();
    }//get all movement

    @PostMapping
    public void addMovement(@RequestBody Movement movement){
        movementService.addMovement(movement);
    }//add Movement

    @PutMapping(path = "{id}")
    public void updateAccount(@PathVariable("id") Long id,
                              @RequestParam(required = false) String movementCode)
    {
        movementService.updateMovement(id, movementCode);
    }//update Movement
}//class MovementController
