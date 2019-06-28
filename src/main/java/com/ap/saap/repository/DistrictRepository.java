package com.ap.saap.repository;

import com.ap.saap.entity.District;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DistrictRepository extends CrudRepository<District, Long>, JpaSpecificationExecutor<District> {

    List<District> findByStateId(long stateId);
    List<District> findAll();
}
