package com.endcombankappapi.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)//no opcional
    @Column(name = "id", unique = true, nullable = false)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "mail", nullable = false)
    private String mail;
    @Column(name = "account", nullable = false)
    private String account;
    @Column(name = "balance", nullable = false)
    private Float balance;

    public Account(Long id, String name, String mail, String account, Float balance) {
        this.id = id;
        this.name = name;
        this.mail = mail;
        this.account = account;
        this.balance = balance;
    }//constructor
    public Account(){}//constructor vacio

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }
}//class
