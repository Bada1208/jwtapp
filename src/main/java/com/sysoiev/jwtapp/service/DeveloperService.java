package com.sysoiev.jwtapp.service;

import com.sysoiev.jwtapp.model.Developer;

import java.util.List;

public interface DeveloperService {
    Developer register(Developer developer);

    List<Developer> getAll();

    Developer findById(Long id);

    void delete(Long id);
}
