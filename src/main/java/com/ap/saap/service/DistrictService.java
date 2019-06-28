package com.ap.saap.service;

import com.ap.saap.entity.District;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public interface DistrictService {

    public List<District> findAll();

    public List<District> findByState(long stateId);

    public Optional<District> findById(long id);

    List<District> findByIds(Set<Long> districtIds);
}
