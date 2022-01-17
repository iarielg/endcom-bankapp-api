package com.endcombankappapi.demo;

import com.endcombankappapi.demo.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class AccountService {
    private final AccountRepository accountRepository;
    @Autowired
    public AccountService (AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }//constructor

    public Account getAccount(Long id){
        return accountRepository.findById(id).orElseThrow(()-> new IllegalStateException("El usuario cone le id" +id +"no existe"));
    }//Get Account

    public List<Account> getAllAccount(){
        return accountRepository.findAll();
    }//getAllAccount

    public void deleteAccount (Long id){
        if (accountRepository.existsById(id)){
            accountRepository.deleteById(id);
        } else {
            throw new IllegalStateException("El usuario con el id" + id + "no existe");
        }//else
    }//delete Account

    @Transactional
    public void updateAccount (Long id, String account, Float balance){
        Account Account = accountRepository.findById(id).orElseThrow(()-> new IllegalStateException("El producto con el id" +id+ "no existe"));
    }//UpdateAccount

    public void addAccount(Account account) {
            Optional <Account> prodById = accountRepository.findById(account.getId());
            if (prodById.isPresent()){
                throw new IllegalStateException("El usuario con el id [" + account.getId() + "] ya existe");
            }//is present
            accountRepository.save(account);
    }
}//class AccountService
