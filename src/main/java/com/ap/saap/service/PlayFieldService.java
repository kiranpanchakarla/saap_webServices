package com.ap.saap.service;

import com.ap.saap.entity.PlayField;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface PlayFieldService {

    public List<PlayField> findAll();

    public List<PlayField> findBySport(long sportId);

    public Optional<PlayField> findById(long id);
}
