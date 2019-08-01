package com.ap.saap.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.ap.saap.entity.Feedback;
import com.ap.saap.entity.FeedbackReply;

public interface FeedbackReplyRepository  extends CrudRepository<FeedbackReply,Integer>,JpaSpecificationExecutor<FeedbackReply>{
	@Query("select r from FeedbackReply r join r.feedback f where f.id=:commentId order by f.id asc")
   //@Query("select r from FeedbackReply r where r.feedback_id=:commentId order by r.feedback_id asc")	
   List<FeedbackReply> findAllByFeedbackId(@Param("commentId") Integer commentId);
	
	
}
