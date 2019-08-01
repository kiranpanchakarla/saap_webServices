package com.ap.saap.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ap.saap.entity.Feedback;
import com.ap.saap.entity.FeedbackReply;
import com.ap.saap.repository.FeedbackReplyRepository;
import com.ap.saap.repository.FeedbackRepository;
import com.ap.saap.service.FeedbackService;
import com.ap.saap.vo.FeedbackVo;
import com.ap.saap.vo.ReplyVo;

@Service
public class FeedbackServiceImpl implements FeedbackService{

	@Autowired
	private FeedbackRepository feedbackRepository;
	
	@Autowired
	private FeedbackReplyRepository replyRepository;
	
	@Override
	public String saveFeedback(Feedback feedback) {
		// TODO Auto-generated method stub
		feedback=feedbackRepository.save(feedback);
		//if(feedback!=null)
		   return "Success";
		//else
			//return "Failed to save";
	}
	@Override
	public List<FeedbackVo> getCommemtsList() {
		List<Feedback> comments=feedbackRepository.findAll();
		List<FeedbackVo> feedbackVos = new ArrayList<FeedbackVo>();
		if(comments.isEmpty()) {
			return feedbackVos;
		} 
			for(Feedback comment:comments) {
				FeedbackVo feedbackVo= new FeedbackVo(comment.getId(), comment.getName(),comment.getEmail(),comment.getSubject(),comment.getBody(), comment.getDate());
				feedbackVos.add(feedbackVo);
			}		
		return feedbackVos;
	}
	/*@Override
	public Feedback getFeedback(Integer feedbackId) {
		// TODO Auto-generated method stub
		Feedback feedback=feedbackRepository.findByCommentId(feedbackId);
		return feedback;
	}*/
	@Override
	public String saveReply(FeedbackReply reply, Integer commentId) {
		Feedback feedback=feedbackRepository.findByCommentId(commentId);
		reply.setFeedback(feedback);
		replyRepository.save(reply);
		   return "Success";
         /*Set<FeedbackReply> repliesSet = new HashSet();
		repliesSet.add(reply);
		feedback.setFeedbackReply(repliesSet);
		feedback=feedbackRepository.save(feedback);
        */
	}
	@Override
	public List<ReplyVo> getRepliesList(Integer commentId) {
		List<FeedbackReply> replies=replyRepository.findAllByFeedbackId(commentId);
		List<ReplyVo> replyVos = new ArrayList<ReplyVo>();
		if(replies.isEmpty()) {
			return replyVos;
		} 
			for(FeedbackReply reply:replies) {
				ReplyVo replyVo= new ReplyVo(reply.getId(), reply.getName(),reply.getBody(), reply.getDate());
				replyVos.add(replyVo);
			}		
		return replyVos;
	}
	
	
	

	
}
