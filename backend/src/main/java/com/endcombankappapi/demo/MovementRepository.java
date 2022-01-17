package com.endcombankappapi.demo;

import com.endcombankappapi.demo.model.Movement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.Optional;


public interface MovementRepository extends JpaRepository<Movement, Long> {

}//interface
