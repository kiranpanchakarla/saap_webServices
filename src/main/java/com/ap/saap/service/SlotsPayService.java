package com.ap.saap.service;

import com.ap.saap.entity.SlotsPay;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface SlotsPayService {

    List<SlotsPay> findAll();

    Optional<SlotsPay> findById(long id);

    List<SlotsPay> findByEventId(long eventId);
}
