package com.ap.saap.service;

import com.ap.saap.entity.Stadium;
import com.ap.saap.model.StadiumFiltersModel;
import com.ap.saap.model.StadiumRequestModel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public interface StadiumService {

    public List<Stadium> findAll();

    public List<Stadium> findByDistrict(long districtId);

    public Optional<Stadium> findById(long id);

    Set<Stadium> search(StadiumRequestModel stadiumRequestModel);

    StadiumFiltersModel filters(StadiumRequestModel stadiumRequestModel);
}
