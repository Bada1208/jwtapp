package com.sysoiev.jwtapp.repository;

import com.sysoiev.jwtapp.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skill, Long> {

    Skill findByName(String name);
}
