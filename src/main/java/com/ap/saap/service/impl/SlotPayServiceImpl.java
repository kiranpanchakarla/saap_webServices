package com.ap.saap.service.impl;

import com.ap.saap.entity.SlotsPay;
import com.ap.saap.repository.SlotPayRepository;
import com.ap.saap.service.SlotsPayService;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SlotPayServiceImpl implements SlotsPayService {

    @Autowired
    private SlotPayRepository slotsPayRepository;

    @Override
    public List<SlotsPay> findAll() {
        return Lists.newArrayList(slotsPayRepository.findAll());
    }

    @Override
    public Optional<SlotsPay> findById(long id) {
        return slotsPayRepository.findById(id);
    }

    @Override
    public List<SlotsPay> findByEventId(long eventId) {
        return slotsPayRepository.findByEventId(eventId);
    }
}
