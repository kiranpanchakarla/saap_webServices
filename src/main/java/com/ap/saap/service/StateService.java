package com.ap.saap.service;

import com.ap.saap.entity.State;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface StateService {

    public List<State> findAll();

    public Optional<State> findById(long id);

}
