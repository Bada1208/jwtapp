package com.sysoiev.jwtapp.repository;

import com.sysoiev.jwtapp.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
