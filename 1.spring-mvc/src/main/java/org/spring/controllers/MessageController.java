package org.spring.controllers;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonView;

import org.spring.model.Message;
import org.spring.model.View;
import org.spring.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

	@Autowired
	private MessageService messageService;

	@JsonView(View.Summary.class)
	@RequestMapping("/all")
	public List<Message> getAllMessages() {
		return messageService.getAll();
	}

	@JsonView(View.SummaryWithRecipients.class)
	@RequestMapping("/with-recipients")
	public List<Message> getAllMessagesWithRecipients() {
		return messageService.getAll();
	}

	@RequestMapping("/{id}")
	public Message getMessage(@PathVariable Long id) {
		return this.messageService.get(id);
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public Message create(@RequestBody Message message) {
		return this.messageService.create(message);
	}

}
