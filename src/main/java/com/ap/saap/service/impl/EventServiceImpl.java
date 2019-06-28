package com.ap.saap.service.impl;

import com.ap.saap.entity.Event;
import com.ap.saap.entity.SlotsPay;
import com.ap.saap.model.EventSlotsModel;
import com.ap.saap.model.StadiumRequestModel;
import com.ap.saap.repository.EventRepository;
import com.ap.saap.repository.EventSpecification;
import com.ap.saap.service.EventService;
import com.ap.saap.service.SlotsPayService;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class EventServiceImpl implements EventService {

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private EventSpecification eventSpecification;

    @Autowired
    private SlotsPayService slotsPayService;

    @Override
    public List<Event> findAll() {
        return Lists.newArrayList(eventRepository.findAll());
    }

    @Override
    public Optional<Event> findById(long id) {
        return eventRepository.findById(id);
    }

    @Override
    public List<Event> search(StadiumRequestModel stadiumRequestModel) {
        return eventRepository.findAll(eventSpecification.searchEvents(stadiumRequestModel));
    }

	@Override
	public Set<EventSlotsModel> searchSlots(StadiumRequestModel stadiumRequestModel) {
		// TODO Auto-generated method stub
		return null;
	}

   /* @Override
    public Set<EventSlotsModel> searchSlots(StadiumRequestModel stadiumRequestModel) {
        List<Event> events = eventRepository.findAll(eventSpecification.searchEvents(stadiumRequestModel));
        return events.stream().map(e -> new EventSlotsModel(e, slotsPayService.findByEventId(e.getId()))).collect(Collectors.toSet());
    }*/
}
