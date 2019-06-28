package com.ap.saap.repository;

import com.ap.saap.entity.PlayField;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PlayFieldRepository extends CrudRepository<PlayField, Long>, JpaSpecificationExecutor<PlayField> {

    List<PlayField> findBySportId(long sportId);
}
