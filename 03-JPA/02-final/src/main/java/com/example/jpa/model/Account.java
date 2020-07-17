package com.example.jpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
public class Account {

    @Id
    @GeneratedValue
    Long id;

    Long personId;

    Long balance;

    public Long getId() {
        return id;
    }

    public Long getPersonId() {
        return personId;
    }

    public Long getBalance() {
        return balance;
    }

    public Account(Long personId, Long balance) {
        this.personId = personId;
        this.balance = balance;
    }

    public Account() {
    }


    

}