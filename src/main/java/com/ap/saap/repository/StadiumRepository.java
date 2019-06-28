package com.ap.saap.repository;

import com.ap.saap.entity.Stadium;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StadiumRepository extends CrudRepository<Stadium, Long>, JpaSpecificationExecutor<Stadium> {

    List<Stadium> findByDistrictId(long districtId);
}
