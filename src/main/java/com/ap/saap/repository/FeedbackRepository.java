package com.ap.saap.repository;

import java.util.List;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ap.saap.entity.Feedback;
import com.ap.saap.entity.FeedbackReply;

@Repository
public interface FeedbackRepository extends CrudRepository<Feedback,Integer>,JpaSpecificationExecutor<Feedback>{
	
	public List<Feedback> findAll();
	
	@Transactional
	@Query("select n from Feedback n where n.id =:feedbackId")
	public Feedback findByCommentId(@Param("feedbackId") Integer feedbackId);


	
}
