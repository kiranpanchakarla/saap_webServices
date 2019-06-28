package com.ap.saap.service;

import com.ap.saap.entity.Event;
import com.ap.saap.model.EventSlotsModel;
import com.ap.saap.model.StadiumRequestModel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public interface EventService {

    public List<Event> findAll();

    public Optional<Event> findById(long id);

    List<Event> search(StadiumRequestModel stadiumRequestModel);

    Set<EventSlotsModel> searchSlots(StadiumRequestModel stadiumRequestModel);
}
