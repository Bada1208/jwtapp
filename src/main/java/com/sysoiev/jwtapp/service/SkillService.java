package com.sysoiev.jwtapp.service;

import com.sysoiev.jwtapp.model.Skill;

import java.util.List;

public interface SkillService {
    Skill register(Skill skill);

    Skill findByName(String name);

    List<Skill> getAll();

    Skill findById(Long id);

    void delete(Long id);
}
