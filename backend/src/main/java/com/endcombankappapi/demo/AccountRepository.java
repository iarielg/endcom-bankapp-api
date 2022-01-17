package com.endcombankappapi.demo;

import com.endcombankappapi.demo.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account,Long> {

}//Interface
