package com.ap.saap.service;

import com.ap.saap.entity.SportType;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface SportTypeService {

    public List<SportType> findAll();

    public Optional<SportType> findById(long id);
}
