package com.ap.saap.repository;

import com.ap.saap.entity.State;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface StateRepository extends CrudRepository<State, Long>, JpaSpecificationExecutor<State> {

}
