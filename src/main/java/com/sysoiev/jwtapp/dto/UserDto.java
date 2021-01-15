package com.sysoiev.jwtapp.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sysoiev.jwtapp.model.Role;
import com.sysoiev.jwtapp.model.Status;
import com.sysoiev.jwtapp.model.User;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDto {
    private Long id;
    private String username;
    private Date created;
    private Date updated;
    private Date lastPassChange;
    private Status status;
    private List<Role> roles;

    public static UserDto fromUser(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setUsername(user.getUsername());
        userDto.setCreated(user.getCreated());
        userDto.setUpdated(user.getUpdated());
        userDto.setLastPassChange(user.getLastPassChange());
        userDto.setStatus(user.getStatus());
        userDto.setRoles(user.getRoles());
        return userDto;
    }
}
