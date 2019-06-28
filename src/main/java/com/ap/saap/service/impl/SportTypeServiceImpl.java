package com.ap.saap.service.impl;

import com.ap.saap.entity.SportType;
import com.ap.saap.repository.SportTypeRepository;
import com.ap.saap.service.SportTypeService;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SportTypeServiceImpl implements SportTypeService {

    @Autowired
    private SportTypeRepository sportTypeRepository;

    @Override
    public List<SportType> findAll() {
        return Lists.newArrayList(sportTypeRepository.findAll());
    }

    @Override
    public Optional<SportType> findById(long id) {
        return sportTypeRepository.findById(id);
    }
}
