package com.ap.saap.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ap.saap.entity.Feedback;
import com.ap.saap.entity.FeedbackReply;
import com.ap.saap.vo.FeedbackVo;
import com.ap.saap.vo.ReplyVo;


@Service
public interface FeedbackService {
     public String saveFeedback(Feedback feedback);
     public List<FeedbackVo> getCommemtsList();
     //public Feedback getFeedback(Integer feedbackId);
     
     public String saveReply(FeedbackReply reply, Integer commentId);
     public List<ReplyVo> getRepliesList(Integer commentId);
}
