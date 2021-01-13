package com.sysoiev.jwtapp.repository;

import com.sysoiev.jwtapp.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}
