package com.ap.saap.service.impl;

import com.ap.saap.entity.*;
import com.ap.saap.model.StadiumFiltersModel;
import com.ap.saap.model.StadiumRequestModel;
import com.ap.saap.repository.StadiumRepository;
import com.ap.saap.service.*;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class StadiumServiceImpl implements StadiumService {

    @Autowired
    private StadiumRepository stadiumRepository;

    @Autowired
    private EventService eventService;

    @Autowired
    private DistrictService districtService;

    @Autowired
    private SportTypeService sportTypeService;

    @Autowired
    private SportService sportService;

    @Autowired
    private PlayFieldService playFieldService;

    @Override
    public List<Stadium> findAll() {
        return Lists.newArrayList(stadiumRepository.findAll());
    }

    @Override
    public List<Stadium> findByDistrict(long districtId) {
        return stadiumRepository.findByDistrictId(districtId);
    }

    @Override
    public Optional<Stadium> findById(long id) {
        return stadiumRepository.findById(id);
    }

    @Override
    public Set<Stadium> search(StadiumRequestModel stadiumRequestModel) {
        if (stadiumRequestModel.getStadiumId() == null && stadiumRequestModel.getDistrictId() == null && stadiumRequestModel.getSportId() == null && stadiumRequestModel.getSportTypeId() == null) {
            return Sets.newHashSet(stadiumRepository.findAll());
        } /*else {
            List<Event> events = eventService.search(stadiumRequestModel);
            return events == null ? null : events.stream().map(Event::getStadium).collect(Collectors.toSet());
        }*/
		return null;
    }

    @Override
    public StadiumFiltersModel filters(StadiumRequestModel stadiumRequestModel) {
        if (stadiumRequestModel.getStadiumId() == null && stadiumRequestModel.getDistrictId() == null && stadiumRequestModel.getSportId() == null && stadiumRequestModel.getSportTypeId() == null) {
            /*return StadiumFiltersModel.builder()
                    .districts(districtService.findAll())
                    .sports(sportService.findAll())
                    .sportTypes(sportTypeService.findAll())
                    .stadiums(this.findAll())
                    .playFields(playFieldService.findAll())
                    .build();*/
        } else {
            List<Event> events = eventService.search(stadiumRequestModel);
            Set<Stadium> stadiums = Sets.newHashSet();
            Set<Sport> sports = Sets.newHashSet();
            Set<SportType> sportTypes = Sets.newHashSet();
            Set<PlayField> playFields = Sets.newHashSet();
            Set<Long> districtIds = Sets.newHashSet();
            List<District> districts = Lists.newArrayList();
            /*if (events != null) {
                events.stream().forEach(event -> {
                    stadiums.add(event.getStadium());
                    districtIds.add(event.getStadium().getDistrictId());
                    sports.add(event.getPlayField().getSport());
                    sportTypes.add(event.getSportType());
                    playFields.add(event.getPlayField());
                });
                districts = districtService.findByIds(districtIds);
            }
            return StadiumFiltersModel.builder()
                    .districts(districts)
                    .sports(Lists.newArrayList(sports))
                    .sportTypes(Lists.newArrayList(sportTypes))
                    .stadiums(Lists.newArrayList(stadiums))
                    .playFields(Lists.newArrayList(playFields))
                    .build();*/
        }
		return null;
    }
}
