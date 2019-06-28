package com.ap.saap.service.impl;

import com.ap.saap.entity.PlayField;
import com.ap.saap.repository.PlayFieldRepository;
import com.ap.saap.service.PlayFieldService;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayFieldServiceImpl implements PlayFieldService {

    @Autowired
    private PlayFieldRepository playFieldRepository;

    @Override
    public List<PlayField> findAll() {
        return Lists.newArrayList(playFieldRepository.findAll());
    }

    @Override
    public List<PlayField> findBySport(long sportId) {
        return playFieldRepository.findBySportId(sportId);
    }

    @Override
    public Optional<PlayField> findById(long id) {
        return playFieldRepository.findById(id);
    }
}
