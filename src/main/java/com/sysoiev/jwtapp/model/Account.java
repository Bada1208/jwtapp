package com.sysoiev.jwtapp.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="account")
@Data
public class Account extends BaseEntity{

    @CreatedDate
    @Column(name = "date")
    private Date createDate;

    @OneToOne(mappedBy = "account", fetch = FetchType.EAGER)
    private Developer developer;
}
