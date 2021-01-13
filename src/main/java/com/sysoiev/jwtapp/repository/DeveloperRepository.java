package com.sysoiev.jwtapp.repository;

import com.sysoiev.jwtapp.model.Developer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeveloperRepository extends JpaRepository<Developer, Long> {
}
