package com.sysoiev.jwtapp.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sysoiev.jwtapp.model.Account;
import com.sysoiev.jwtapp.model.Developer;
import lombok.Data;

import java.util.Date;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountDto {
    private Long id;
    private Date createdData;
    private Developer developer;

    public static AccountDto fromAccount(Account account) {
        AccountDto accountDto = new AccountDto();
        accountDto.setId(account.getId());
        accountDto.setCreatedData(account.getCreateDate());
        accountDto.setDeveloper(account.getDeveloper());
        return accountDto;
    }
}