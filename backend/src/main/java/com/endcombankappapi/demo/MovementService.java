package com.endcombankappapi.demo;

import com.endcombankappapi.demo.model.Movement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class MovementService {
    private final MovementRepository movementRepository;
    @Autowired
    public MovementService (MovementRepository movementRepository){
        this.movementRepository = movementRepository;
    }//constructor

    public Movement getMovement (Long id){
        return movementRepository.findById(id).orElseThrow(()-> new IllegalStateException("El usuario cone le id" +id +"no existe"));
    }//get Movement

    public List<Movement> getAllMovement(){
        return movementRepository.findAll();
    }//get all movement

    public void deleteMovement (Long id){
        if (movementRepository.existsById(id)){
            movementRepository.deleteById(id);
        } else {
            throw new IllegalStateException("EL usuario con el id" +id +"no exite");
        }//else
    }//delete Movement
    

//    public void addMovement (Movement movement){
//        Optional <Movement> prodByMail = movementRepository.findByMail(movement.getMail());
//        if (prodByMail.isPresent()){
//            throw new IllegalStateException("El usuario con el mail [" + movement.getMail() + "] ya existe");
//        }//isPresent
//        movementRepository.save(movement);
//    }//add Movement
    @Transactional
    public void updateMovement (Long id, String movementCode){
        Movement movement = movementRepository.findById(id).orElseThrow(()-> new IllegalStateException("El producto con el id" +id+ "no existe"));
    }//UpdateMovement

    public void addMovement(Movement movement) {
        Optional <Movement> prodById = movementRepository.findById(movement.getId());
        if (prodById.isPresent()){
            throw new IllegalStateException("El usuario con el id [" + movement.getId() + "] ya existe");
        }//is present
        movementRepository.save(movement);
    }//uodateMovement
}//class MovementService
