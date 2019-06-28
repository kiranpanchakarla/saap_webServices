package com.ap.saap.repository;

import com.ap.saap.entity.SportType;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface SportTypeRepository extends CrudRepository<SportType, Long>, JpaSpecificationExecutor<SportType> {

}
