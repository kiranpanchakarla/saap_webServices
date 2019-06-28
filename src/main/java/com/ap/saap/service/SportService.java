package com.ap.saap.service;

import com.ap.saap.entity.Sport;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface SportService {

    public List<Sport> findAll();

    public Optional<Sport> findById(long id);

}
