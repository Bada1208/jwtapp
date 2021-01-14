package com.sysoiev.jwtapp.service.impl;

import com.sysoiev.jwtapp.model.Developer;
import com.sysoiev.jwtapp.repository.DeveloperRepository;
import com.sysoiev.jwtapp.service.DeveloperService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class DeveloperServiceImpl implements DeveloperService {
    private final DeveloperRepository developerRepository;

    @Autowired
    public DeveloperServiceImpl(DeveloperRepository developerRepository) {
        this.developerRepository = developerRepository;
    }

    @Override
    public Developer register(Developer developer) {
        log.info("IN DeveloperServiceImpl save {}", developer);
        developerRepository.save(developer);
        developerRepository.flush();
        return developer;
    }


    @Override
    public Developer findById(Long id) {
        Developer result = developerRepository.findById(id).orElse(null);

        if (result == null) {
            log.warn("IN findById - no developer found by id: {}", id);
            return null;
        }

        log.info("IN findById - developer: {} found by id: {}", result);
        return result;
    }


    @Override
    public void delete(Long id) {
        log.info("IN DeveloperServiceImpl delete {}", id);
        developerRepository.deleteById(id);
    }

    @Override
    public List<Developer> getAll() {
        log.info("IN AccountServiceImpl getAll");
        return developerRepository.findAll();
    }
}
