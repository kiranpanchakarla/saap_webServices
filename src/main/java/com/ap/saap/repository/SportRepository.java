package com.ap.saap.repository;

import com.ap.saap.entity.Sport;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface SportRepository extends CrudRepository<Sport, Long>, JpaSpecificationExecutor<Sport> {

}
