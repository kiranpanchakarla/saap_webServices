package com.ap.saap.service.impl;

import com.ap.saap.entity.State;
import com.ap.saap.repository.StateRepository;
import com.ap.saap.service.StateService;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StateServiceImpl implements StateService {

    @Autowired
    private StateRepository stateRepository;

    @Override
    public List<State> findAll() {
        return Lists.newArrayList(stateRepository.findAll());
    }

    @Override
    public Optional<State> findById(long id) {
        return stateRepository.findById(id);
    }
}
