package com.ap.saap.repository;

import com.ap.saap.entity.Event;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Event, Long>, JpaSpecificationExecutor<Event> {

}
