package com.ap.saap.service.impl;

import com.ap.saap.entity.Sport;
import com.ap.saap.repository.SportRepository;
import com.ap.saap.service.SportService;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SportServiceImpl implements SportService {

    @Autowired
    private SportRepository sportRepository;

    @Override
    public List<Sport> findAll() {
        return Lists.newArrayList(sportRepository.findAll());
    }

    @Override
    public Optional<Sport> findById(long id) {
        return sportRepository.findById(id);
    }
}
