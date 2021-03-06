package org.spring.service;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.spring.model.Message;
import org.spring.model.UserJson;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

	private final List<Message> messages = new ArrayList<>();

	public MessageService() {
		UserJson brian = new UserJson(1L, "Brian", "Clozel", "bclozel@pivotal.io", "1 Jaures street", "69003", "Lyon", "France");
		UserJson stephane = new UserJson(2L, "Stéphane", "Nicoll", "snicoll@pivotal.io", "42 Obama street", "1000", "Brussel", "Belgium");
		UserJson rossen = new UserJson(3L, "Rossen", "Stoyanchev", "rstoyanchev@pivotal.io", "3 Warren street", "10011", "New York", "USA");

		//Message info = new Message(1L, "Info", "This is an information message", brian, stephane, rossen);
		Message warning = new Message(2L, "Warning", "This is a warning message", stephane, rossen);
		Message alert = new Message(3L, "Alert", "This is an alert message", rossen, brian);

		//messages.add(info);
		messages.add(warning);
		messages.add(alert);
	}

	public List<Message> getAll() {
		return messages;
	}

	public Message get(Long id) {
		return this.messages.stream().filter((m) -> m.getId() == id).findFirst().get();
	}

	public Message create(Message message) {
		this.messages.add(message);
		return message;
	}
}
