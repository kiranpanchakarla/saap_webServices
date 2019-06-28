package com.ap.saap.repository;

import com.ap.saap.entity.SlotsPay;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SlotPayRepository extends CrudRepository<SlotsPay, Long>, JpaSpecificationExecutor<SlotsPay> {

    List<SlotsPay> findByEventId(long eventId);
}
