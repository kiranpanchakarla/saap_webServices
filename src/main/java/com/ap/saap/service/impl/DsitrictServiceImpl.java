package com.ap.saap.service.impl;

import com.ap.saap.entity.District;
import com.ap.saap.repository.DistrictRepository;
import com.ap.saap.service.DistrictService;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class DsitrictServiceImpl implements DistrictService {

    @Autowired
    private DistrictRepository districtRepository;

    @Override
    public List<District> findAll() {
        return Lists.newArrayList(districtRepository.findAll());
    }

    @Override
    public List<District> findByState(long stateId) {
        return districtRepository.findByStateId(stateId);
    }

    @Override
    public Optional<District> findById(long id) {
        return districtRepository.findById(id);
    }

    @Override
    public List<District> findByIds(Set<Long> districtIds) {
        return Lists.newArrayList(districtRepository.findAllById(districtIds));
    }
}
