package com.sysoiev.jwtapp.service;

import com.sysoiev.jwtapp.model.Account;

import java.util.List;

public interface AccountService {
    Account register(Account account);

    List<Account> getAll();

    Account findById(Long id);

    void delete(Long id);
}
