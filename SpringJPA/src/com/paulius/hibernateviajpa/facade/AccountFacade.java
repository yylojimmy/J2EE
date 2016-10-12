package com.paulius.hibernateviajpa.facade;

import com.paulius.hibernateviajpa.entity.Account;

import org.springframework.stereotype.Repository;

@Repository
public class AccountFacade extends AbstractFacade<Account> {

    public AccountFacade() {
        super(Account.class);
    }

}
