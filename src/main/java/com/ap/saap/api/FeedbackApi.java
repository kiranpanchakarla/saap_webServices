package com.ap.saap.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ap.saap.entity.Feedback;
import com.ap.saap.entity.FeedbackReply;
import com.ap.saap.entity.Notification;
import com.ap.saap.repository.FeedbackRepository;
import com.ap.saap.service.FeedbackService;
import com.ap.saap.service.impl.EmailService;
import com.ap.saap.vo.FeedbackVo;
import com.ap.saap.vo.ReplyVo;


@RestController
@RequestMapping(value ="/api/general/feedback", produces = MediaType.APPLICATION_JSON_VALUE)
public class FeedbackApi {
	
	@Autowired
	private EmailService emailService;
	@Autowired
	private FeedbackService feedbackService;
	@Autowired
	private FeedbackRepository feedbackRepository;

	//To save feedback form data in db and to send an Email
	@RequestMapping(value = "/saveFeedback",method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String saveFeedback(@RequestBody Feedback feedback) throws Exception {
		String saveStatus=feedbackService.saveFeedback(feedback);
		try {
			emailService.sendEmail(feedback);
		}catch(Exception e) {
			System.out.println(e);
		}
		return saveStatus;
	}
	
	//To get all comments on Feedback page loading
	@RequestMapping(value="/allComments")
	public Object getAllComments() {
		List<FeedbackVo> feedbackVos = feedbackService.getCommemtsList();
		if (feedbackVos.isEmpty()) {
			return "Comments not found";
		}

		return feedbackVos;
	}

	//To save reply based on comment id
	@RequestMapping(value = "/comments/{commentId}/saveReply",method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String saveReply(@PathVariable (value = "commentId") Integer commentId,@RequestBody FeedbackReply reply) throws Exception {
		String saveStatus=feedbackService.saveReply(reply,commentId);
		return saveStatus;
	}	
	/*@RequestMapping(value="/allReplies")
	public Object getAllRepliesForComment(@RequestParam Integer commentId) {
		List<ReplyVo> replyVos = feedbackService.getRepliesList(commentId);
		if (replyVos.isEmpty()) {
			return "Replies not found";
		}
		return replyVos;
	}*/
	
	//Getting all replies of a particular comment by comment id
	@RequestMapping(value="/replies/{commentId}")
	public Object getAllReplies(@PathVariable(value="commentId") Integer commentId) {
		List<ReplyVo> replyVos = feedbackService.getRepliesList(commentId);
		if (replyVos.isEmpty()) {
			return "Replies not found";
		}
		return replyVos;
	}
}
