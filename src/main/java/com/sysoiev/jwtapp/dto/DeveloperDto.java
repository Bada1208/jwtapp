package com.sysoiev.jwtapp.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sysoiev.jwtapp.model.Account;
import com.sysoiev.jwtapp.model.Developer;
import com.sysoiev.jwtapp.model.Skill;
import lombok.Data;

import java.util.Set;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class DeveloperDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String specialty;
    private Set<Skill> skill;
    private Account account;

    public static DeveloperDto fromDeveloper(Developer developer) {
        DeveloperDto developerDto = new DeveloperDto();
        developerDto.setId(developer.getId());
        developerDto.setFirstName(developer.getFirstName());
        developerDto.setLastName(developer.getLastName());
        developerDto.setSpecialty(developer.getSpecialty());
        developerDto.setSkill(developer.getSkill());
        developerDto.setAccount(developer.getAccount());
        return developerDto;
    }
}
