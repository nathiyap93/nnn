package com.fms.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fms.model.Event;

import reactor.core.publisher.Flux;

@RestController
public class EventController {

	@Autowired
	EventRepo eventrepo;
	
@GetMapping("/allevents")
public Flux<Event> findEvents(){
	return eventrepo.findAll();
	}

	
}
